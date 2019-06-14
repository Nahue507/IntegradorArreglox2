package Investigador;

import java.util.ArrayList;

import Proyecto.Proyecto;


public class Investigador {
	
	public ArrayList<Proyecto> proyectos;
	
	

	public Investigador() {
		this.proyectos = new ArrayList<Proyecto>();
	}
	
	public Investigador( ArrayList<Proyecto> proyecto) {
		this.proyectos = proyecto;
	}

	public ArrayList<Proyecto> getProyectos() {
		return proyectos;	
	}

	public void sumarProyectoALaLista(Proyecto proyecto) {
		this.proyectos.add(proyecto);
	}
	
	public void darDeBajaProyecto(Proyecto proyecto) {
		this.proyectos.remove(proyecto);
	}

}
