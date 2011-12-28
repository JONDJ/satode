package fing.satode.data;

import java.io.Serializable;
import java.util.ArrayList;

public class DepartamentoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nombre;
	private ArrayList<CiudadDTO> ciudades;
	
	public Long getId() {
		return id;
	}
	public ArrayList<CiudadDTO> getCiudades() {
		return ciudades;
	}
	public void setCiudades(ArrayList<CiudadDTO> ciudades) {
		this.ciudades = ciudades;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}