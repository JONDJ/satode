package fing.satode.bl.desastres;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import fing.satode.bl.base.ServiceBase;
import fing.satode.constantes.EstadoNecesidad;
import fing.satode.constantes.EstadoSolicitudEnvio;
import fing.satode.data.CostoDTO;
import fing.satode.data.DesastreDTO;
import fing.satode.data.EstadoDesastreDTO;
import fing.satode.data.NecesidadDTO;
import fing.satode.data.SolicitudEnvioDTO;
import fing.satode.data.TipoCostoDTO;
import fing.satode.dominio.Costo;
import fing.satode.dominio.Desastre;
import fing.satode.dominio.GestionNecesidad;
import fing.satode.dominio.Necesidad;
import fing.satode.dominio.PlanSuministro;
import fing.satode.dominio.SolicitudEnvio;
import fing.satode.dominio.TipoCosto;
import fing.satode.pl.deposito.SolicitudEnvioDAO;
import fing.satode.pl.desastres.CostoDAO;
import fing.satode.pl.desastres.DesastreDAO;
import fing.satode.pl.desastres.TipoCostoDAO;
import fing.satode.pl.necesidades.NecesidadesDAO;

@Transactional
public class DesastresService extends ServiceBase {

	public ArrayList<DesastreDTO> listaDesastres() {
		// TODO Auto-generated method stub
		ArrayList<DesastreDTO> listaDTOS= new ArrayList<DesastreDTO>();
		ArrayList<Desastre> listaDes= DesastreDAO.getInstance().listaDesastres();
		for(Desastre d: listaDes){
			listaDTOS.add(d.getDTO());
		}
		return listaDTOS;
	}

	public void nuevoDesastre(DesastreDTO dto) {
		// TODO Auto-generated method stub
		Desastre desastre= new Desastre(dto);
		DesastreDAO.getInstance().nuevoDesastre(desastre);
	}

	public void modificarDesastre(DesastreDTO dto) {
		// TODO Auto-generated method stub
		Desastre desastre= new Desastre(dto);
		DesastreDAO.getInstance().modificarDesastre(desastre);
	}

	public void eliminarDesastre(DesastreDTO dto) {
		// TODO Auto-generated method stub
		Desastre desastre= new Desastre(dto);
		DesastreDAO.getInstance().eliminarDesastre(desastre);
	}
	
	public ArrayList<TipoCostoDTO> listaTipoCosto() {
		// TODO Auto-generated method stub
		ArrayList<TipoCostoDTO> listaDTOS= new ArrayList<TipoCostoDTO>();
		ArrayList<TipoCosto> listaDes= TipoCostoDAO.getInstance().listaTipoCosto();
		for(TipoCosto d: listaDes){
			listaDTOS.add(d.getDTO());
		}
		return listaDTOS;
	}

	public void nuevoTipoCosto(TipoCostoDTO dto) {
		// TODO Auto-generated method stub
		TipoCosto tipoCosto= new TipoCosto(dto);
		TipoCostoDAO.getInstance().nuevoTipoCosto(tipoCosto);
	}

	public void modificarTipoCosto(TipoCostoDTO dto) {
		// TODO Auto-generated method stub
		TipoCosto tipoCosto= new TipoCosto(dto);
		TipoCostoDAO.getInstance().modificarTipoCosto(tipoCosto);
	}

	public void eliminarTipoCosto(TipoCostoDTO dto) {
		// TODO Auto-generated method stub
		TipoCosto tipoCosto= new TipoCosto(dto);
		TipoCostoDAO.getInstance().eliminarTipoCosto(tipoCosto);
	}

	public ArrayList<CostoDTO> listaCosto() {
		// TODO Auto-generated method stub
		ArrayList<CostoDTO> listaDTOS= new ArrayList<CostoDTO>();
		ArrayList<Costo> listaDes= CostoDAO.getInstance().listaoCosto();
		for(Costo d: listaDes){
			listaDTOS.add(d.getDTO());
		}
		return listaDTOS;
	}

	public void nuevoCosto(CostoDTO dto) {
		Costo costo= new Costo(dto);
		CostoDAO.getInstance().nuevoCosto(costo);
	}

	public void modificarCosto(CostoDTO dto) {
		Costo costo= new Costo(dto);
		CostoDAO.getInstance().modificarCosto(costo);
	}

	public void eliminarCosto(CostoDTO dto) {
		Costo costo= new Costo(dto);
		CostoDAO.getInstance().eliminarCosto(costo);
	}

	public ArrayList<CostoDTO> listaCosto(Long idDesastre) {
		ArrayList<CostoDTO> listaDTOS= new ArrayList<CostoDTO>();
		ArrayList<Costo> listaDes= CostoDAO.getInstance().listaoCosto(idDesastre);
		for(Costo d: listaDes){
			listaDTOS.add(d.getDTO());
		}
		return listaDTOS;
	}

	public EstadoDesastreDTO reporteEstadoDesastre(Long idDesastre) {
		EstadoDesastreDTO dto=new EstadoDesastreDTO();

		dto.setNecesidadesLocales(getDTOsNececidades(NecesidadesDAO.getInstance().buscarNecesidades(idDesastre, Long.valueOf(EstadoNecesidad.INGRESADA), true)));
		dto.setNecesidadesPendientes(getDTOsNececidades(NecesidadesDAO.getInstance().buscarNecesidades(idDesastre, Long.valueOf(EstadoNecesidad.INGRESADA), false)));
		dto.getNecesidadesPendientes().addAll(getDTOsNececidades(NecesidadesDAO.getInstance().buscarNecesidades(idDesastre, Long.valueOf(EstadoNecesidad.EN_PROCESO), false)));
		dto.setNecesidadesRechazadas(getDTOsNececidades(NecesidadesDAO.getInstance().buscarNecesidades(idDesastre, Long.valueOf(EstadoNecesidad.RECHAZADA), false)));
		dto.setNecesidadesAprobadas(getDTOsNececidades(NecesidadesDAO.getInstance().buscarNecesidades(idDesastre, Long.valueOf(EstadoNecesidad.ACEPTADA), false)));
		
		dto.setSolicitudPendiente(getDTSSolicitudEnvio(SolicitudEnvioDAO.getInstance().buscarSolicitudesEnvio(0L, 0L, EstadoSolicitudEnvio.NUEVA)));
		
		ArrayList<SolicitudEnvio> solicitudesPEndientes=new ArrayList<SolicitudEnvio>();
		ArrayList<SolicitudEnvio> solicitudesNoRecibidas=new ArrayList<SolicitudEnvio>();
		ArrayList<SolicitudEnvio> solicitudesRecibidas=new ArrayList<SolicitudEnvio>();
		
		for(GestionNecesidad n:NecesidadesDAO.getInstance().buscarGestionNecesidadesPorDesastre(idDesastre)){
			for(PlanSuministro ps:n.getPlanesSuministros()){
				for(SolicitudEnvio solEnv:ps.getSolicitudesEnvios()){
					switch(solEnv.getEstado()){
						case EstadoSolicitudEnvio.NUEVA:
							solicitudesPEndientes.add(solEnv);
							break;
						case EstadoSolicitudEnvio.ENVIADA:
							solicitudesNoRecibidas.add(solEnv);
							break;
						case EstadoSolicitudEnvio.RECIBIDA_OK:
							solicitudesRecibidas.add(solEnv);
							break;							
						case EstadoSolicitudEnvio.RECIBIDA_OBS:
							solicitudesRecibidas.add(solEnv);
							break;												}
				}
			}
		}
		
		dto.setSolicitudEnviadasNoRecibidas(getDTSSolicitudEnvio(solicitudesPEndientes));
		dto.setSolicitudEnvioRecibidas(getDTSSolicitudEnvio(solicitudesRecibidas));
		dto.setSolicitudEnviadasNoRecibidas(getDTSSolicitudEnvio(solicitudesNoRecibidas));
		dto.setCostos(getDTOsCostos(CostoDAO.getInstance().listaoCosto(idDesastre)));
		
		return dto;
	}

	private ArrayList<CostoDTO> getDTOsCostos(ArrayList<Costo> costos) {
		ArrayList<CostoDTO> listaDTOS= new ArrayList<CostoDTO>();
		for(Costo d: costos){
			listaDTOS.add(d.getDTO());
		}
		return listaDTOS;
	}

	private ArrayList<SolicitudEnvioDTO> getDTSSolicitudEnvio(ArrayList<SolicitudEnvio> solicitudesEnvio) {
		ArrayList<SolicitudEnvioDTO> listaDTOS= new ArrayList<SolicitudEnvioDTO>();
		for(SolicitudEnvio d: solicitudesEnvio){
			listaDTOS.add(d.getDTO());
		}
		return listaDTOS;
	}

	private ArrayList<NecesidadDTO> getDTOsNececidades(ArrayList<Necesidad> necesidades) {
		ArrayList<NecesidadDTO> listaDTOS= new ArrayList<NecesidadDTO>();
		for(Necesidad d: necesidades){
			listaDTOS.add(d.getDTO());
		}
		return listaDTOS;
	}
}
