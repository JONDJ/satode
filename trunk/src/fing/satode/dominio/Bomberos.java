package fing.satode.dominio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import fing.satode.data.BomberosDTO;

@Entity @Table(name="bomberos")
@PrimaryKeyJoinColumn(name="puntoReferencia_Id")
public class Bomberos extends PuntoReferencia {

	private int cantidadFuncionarios;
	private int cantidadVehiculos;
	
	public Bomberos(){}
	
	public Bomberos(boolean puntoEntrada, boolean puntoEntega, Ciudad ciudad,
			Departamento departamento, String direccion, String telefono,
			int tipo, int cantidadFuncionarios, int cantidadVehiculos) {
		super(puntoEntrada, puntoEntega, ciudad, departamento, direccion,
				telefono, tipo);
		this.cantidadFuncionarios = cantidadFuncionarios;
		this.cantidadVehiculos = cantidadVehiculos;
	}
	
	public Bomberos(BomberosDTO dto) {
		super(dto);
		this.cantidadFuncionarios = dto.getCantidadFuncionarios();
		this.cantidadVehiculos = dto.getCantidadVehiculos();
	}
	
	public BomberosDTO getDTO() {
		BomberosDTO dto= new BomberosDTO();
		dto.setId(this.getId());
		dto.setDireccion(this.getDireccion());
		dto.setTelefono(this.getTelefono());
		dto.setPuntoEntrada(this.isPuntoEntrada());
		dto.setPuntoEntrega(this.ispuntoEntrega());
		dto.setTipo(this.getTipo());
		dto.setCiudad(this.getCiudad().getDTO());
		dto.setDepartamento(this.getDepartamento().getDTO());
		dto.setCantidadFuncionarios(this.cantidadFuncionarios);
		dto.setCantidadVehiculos(this.cantidadVehiculos);
		return dto;
	}

	public int getCantidadFuncionarios() {
		return cantidadFuncionarios;
	}

	public void setCantidadFuncionarios(int cantidadFuncionarios) {
		this.cantidadFuncionarios = cantidadFuncionarios;
	}

	public int getCantidadVehiculos() {
		return cantidadVehiculos;
	}

	public void setCantidadVehiculos(int cantidadVehiculos) {
		this.cantidadVehiculos = cantidadVehiculos;
	}

	
	
}
