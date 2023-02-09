package co.edu.unbosque.view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

import javax.swing.*;

public class FrameListar extends JFrame {
	
	private ArrayList<PanelLista> panel;
	private JPanel scroll;
	private JButton atras;
	public static final String ATRAS = "ATRAS";
	
	public FrameListar(MouseWheelListener wheel, ActionListener con) {
		
		panel = new ArrayList<PanelLista>();
		scroll = new JPanel();
		atras = new JButton("Atras");
		atras.setBounds(-2, 0, 80, 700);
		atras.setActionCommand(ATRAS);
		atras.addActionListener(con);
		
		this.add(atras);
		this.add(scroll);
		this.setLayout(null);
		this.setSize(600, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.addMouseWheelListener(wheel);
		
	}
	
	public void rellenarDatos(String nom, String car, int ed, long id) {
		
		panel.add(new PanelLista(nom, car, ed, id));
	
	}
	
	public void generarScroll() {
		
		scroll.setBounds(80, 0, 510, ((panel.size()*50)+5));
		scroll.setLayout(new GridLayout(panel.size(), 1));
		
		for (int i = 0; i < panel.size(); i ++) {
			
			scroll.add(panel.get(i));
			
		}
		
	}
	
	public void movimientoScroll(int y, int q) {
		
		if (panel.size() < 14) {}
		else {
			if (q == 2 && scroll.getY() <= 0) {
				scroll.setBounds(scroll.getX(), Math.abs(y * 6) + scroll.getY(), scroll.getWidth(), scroll.getHeight());
			} else if (q == 1 && scroll.getY() > (700 - scroll.getHeight()- 30)) {
				scroll.setBounds(scroll.getX(), scroll.getY() - y * 6, scroll.getWidth(), scroll.getHeight());
			} else if (q == 1 && scroll.getY() <= (700 - scroll.getHeight() - 30)) {
				scroll.setBounds(scroll.getX(), (700- scroll.getHeight()-30), scroll.getWidth(), scroll.getHeight());
			} else if (q == 2 && scroll.getY() <= 0) {
				scroll.setBounds(scroll.getX(), 0, scroll.getWidth(), scroll.getHeight());
			}
		}
	}
	
	public void limpiarTodo() {
		
		scroll.removeAll();
		for(int i = (panel.size() - 1);i > -1;i--) {
			
			panel.remove(i);
			
		}
		
	}

}
