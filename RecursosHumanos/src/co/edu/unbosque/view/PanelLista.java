package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class PanelLista extends JPanel{

	private JLabel Tnom, Ted, Tid, Tcar;
	
	public PanelLista(String nombre, String cargo, int edad, long cedula){
		
		Tnom = new JLabel("Nombre: " + nombre);
		Tcar = new JLabel("Cargo: "+ cargo);
		Ted = new JLabel("Edad: " + edad);
		Tid = new JLabel("Cedula: " + cedula);
		
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(2,2));
		this.add(Tnom);
		this.add(Tid);
		this.add(Ted);
		this.add(Tcar);
		
	}
	
}
