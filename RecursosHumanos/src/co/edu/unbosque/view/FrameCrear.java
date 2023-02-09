package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.*;

import co.edu.unbosque.controller.Controller;

public class FrameCrear extends JFrame {
	
	private JButton crear, atras;
	private JTextField nombre, apellido, cedula, edad, cargo;
	private JLabel Tnombre, Tapellido, Tcedula, Tedad, Tcargo,datos,botones;
	public static final String CREAR = "CREAR";
	public static final String MODIFICAR = "MODIFICAR2";
	public static final String ATRAS = "ATRAS";
	
	
	/**
	 * Este es el metodo constructor de la clase, tiene definido el tama�o de la
	 * pantalla e inicializa el codigo de la misma.
	 */
	public FrameCrear(Controller con) {
		
		crear = new JButton("Crear");
		crear.setActionCommand(CREAR);
		crear.addActionListener(con);
		atras = new JButton("Atras");
		atras.setActionCommand(ATRAS);
		atras.addActionListener(con);
		nombre = new JTextField();
		apellido = new JTextField();
		cedula = new JTextField();
		edad = new JTextField();
		cargo = new JTextField();
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
		botones.add(crear);
		
		
		this.setSize(1000, 500);
 		this.add(datos);
		this.add(botones);
		this.setLayout(new GridLayout(2,1,25,25));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
	}

	public JButton getCrear() {
		return crear;
	}

	public void setCrear(JButton crear) {
		this.crear = crear;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

	public JTextField getNombre() {
		return nombre;
	}

	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}

	public JTextField getApellido() {
		return apellido;
	}

	public void setApellido(JTextField apellido) {
		this.apellido = apellido;
	}

	public JTextField getCedula() {
		return cedula;
	}

	public void setCedula(JTextField cedula) {
		this.cedula = cedula;
	}

	public JTextField getEdad() {
		return edad;
	}

	public void setEdad(JTextField edad) {
		this.edad = edad;
	}

	public JTextField getCargo() {
		return cargo;
	}

	public void setCargo(JTextField cargo) {
		this.cargo = cargo;
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
	public void modificar() {
		
		crear.setText("Modificar");
		crear.setActionCommand(MODIFICAR);
		
	}
	public void reset() {
		
		crear.setText("Crear");
		crear.setActionCommand(CREAR);
		
	}
	
}
