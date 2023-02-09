package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import co.edu.unbosque.controller.Controller;

public class FrameEliminar extends JFrame {

	private JButton eliminar, atras;
	private JLabel Tnombre, Tapellido, Tcedula, Tedad, Tcargo,datos, botones, nombre, apellido, cedula, edad, cargo;
	public static final String ATRAS = "ATRAS";
	public static final String ELIMINAR = "ELIMINAR2";
	
	public FrameEliminar(Controller con) {
		
		eliminar = new JButton("Eliminar");
		eliminar.setActionCommand(ELIMINAR);
		eliminar.addActionListener(con);
		atras = new JButton("Atras");
		atras.setActionCommand(ATRAS);
		atras.addActionListener(con);
		nombre = new JLabel("");
		apellido = new JLabel("");
		cedula = new JLabel("");
		edad = new JLabel("");
		cargo = new JLabel("");
		Tnombre = new JLabel("Nombre:");
		Tapellido = new JLabel("Apellido:");
		Tcedula = new JLabel("Cedula:");
		Tedad = new JLabel("Edad:");
		Tcargo = new JLabel("Cargo:");
		datos = new JLabel();
		datos.setLayout(new GridLayout(5,2));
		datos.add(Tnombre);
		datos.add(nombre);
		datos.add(Tapellido);
		datos.add(apellido);
		datos.add(Tcedula);
		datos.add(cedula);
		datos.add(Tedad);
		datos.add(edad);
		datos.add(Tcargo);
		datos.add(cargo);
		botones = new JLabel();
		botones.setLayout(new GridLayout(1,2));
		botones.add(atras);
		botones.add(eliminar);
		
		
		this.setSize(300, 800);
 		this.add(datos);
		this.add(botones);
		this.setLayout(new GridLayout(2,1,25,25));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

	public JLabel getTnombre() {
		return Tnombre;
	}

	public void setTnombre(JLabel tnombre) {
		Tnombre = tnombre;
	}

	public JLabel getTapellido() {
		return Tapellido;
	}

	public void setTapellido(JLabel tapellido) {
		Tapellido = tapellido;
	}

	public JLabel getTcedula() {
		return Tcedula;
	}

	public void setTcedula(JLabel tcedula) {
		Tcedula = tcedula;
	}

	public JLabel getTedad() {
		return Tedad;
	}

	public void setTedad(JLabel tedad) {
		Tedad = tedad;
	}

	public JLabel getTcargo() {
		return Tcargo;
	}

	public void setTcargo(JLabel tcargo) {
		Tcargo = tcargo;
	}

	public JLabel getDatos() {
		return datos;
	}

	public void setDatos(JLabel datos) {
		this.datos = datos;
	}

	public JLabel getBotones() {
		return botones;
	}

	public void setBotones(JLabel botones) {
		this.botones = botones;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getApellido() {
		return apellido;
	}

	public void setApellido(JLabel apellido) {
		this.apellido = apellido;
	}

	public JLabel getCedula() {
		return cedula;
	}

	public void setCedula(JLabel cedula) {
		this.cedula = cedula;
	}

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}

	public JLabel getCargo() {
		return cargo;
	}

	public void setCargo(JLabel cargo) {
		this.cargo = cargo;
	}
	
	
	
}
