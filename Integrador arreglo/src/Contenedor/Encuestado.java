package Contenedor;

import java.util.ArrayList;

import Encuesta.Encuesta;
import Preguntas.Pregunta;
import Respuesta.Respuesta;

public class Encuestado {
	private String nombre;
	private String apellido;
	private Encuesta encuesta;
	private Pregunta preguntaActual;
	
	
	public ArrayList<Respuesta> respuestasDelEncuestado;
	
	
	public Encuestado( String nombre, String apellido , Encuesta encuesta){
		this.nombre= nombre;
		this.apellido=apellido;
		this.respuestasDelEncuestado = new ArrayList<Respuesta>();
		this.encuesta=encuesta;
	}
	
	
	
	public Encuestado(ArrayList<Respuesta> respuestasDelEncuestado) {
		super();
		this.respuestasDelEncuestado = respuestasDelEncuestado;
	}



	public String getDatosDelEncuestado() {
		return this.nombre+ " " +this.apellido;
	}
	
	public ArrayList<Respuesta> getRespuestasDelEncuestado(){
		return  this.respuestasDelEncuestado;
	}

	public void addRespuesta(Respuesta res) {
		res.setPregunta(this.preguntaActual);
		this.respuestasDelEncuestado.add(res);
	}
	public void fin() {
		encuesta.encuestaFinalizada(this);
	}
	public Pregunta getPreguntaActual() {
		return this.preguntaActual;
	}
	public void setPreguntaActual(Pregunta preg) {
		this.preguntaActual=preg;
	}
}
