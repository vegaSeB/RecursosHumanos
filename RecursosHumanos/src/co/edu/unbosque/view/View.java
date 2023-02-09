package co.edu.unbosque.view;

import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class View{
	
	FramePrincipal principal;
	FrameCrear Crear;
	FrameListar lista;
	FrameCandidato candidato;
	FrameEliminar eliminar;
	public View(Controller con) {
		
		this.principal = new FramePrincipal(con);
		this.Crear = new FrameCrear(con);
		this.lista = new FrameListar(con,con);
		this.candidato = new FrameCandidato(con);
		this.eliminar = new FrameEliminar(con);
		
		
	}
	public FramePrincipal getPrincipal() {
		return principal;
	}
	public FrameCrear getCrear() {
		return Crear;
	}
	public FrameListar getLista() {
		return lista;
	}
	public FrameCandidato getCandidato() {
		return candidato;
	}
	public FrameEliminar getEliminar() {
		return eliminar;
	}

	public String buscar(){
		
		return JOptionPane.showInputDialog(null, "Ingrese la cedula de la persona a buscar");
		
		
	}

}
