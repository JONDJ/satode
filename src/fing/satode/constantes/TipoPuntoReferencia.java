package fing.satode.constantes;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.gwt.user.client.rpc.IsSerializable;

public class TipoPuntoReferencia implements Serializable, IsSerializable{

	private static final long serialVersionUID = 1L;

	public final static int HOSPITAL=1;
	public final static int REFUGIO=2;
	public final static int POLICIA=3;
	public final static int CAMINERA=4;
	public final static int CUARTEL=5;
	public final static int BOMBEROS=6;
	public final static int OTROS=7;
	
	public static String HOSPITAL_TXT="Hospital";
	public static String REFUGIO_TXT="Refugio";
	public static String POLICIA_TXT="Policia";
	public static String CAMINERA_TXT="Caminera";
	public static String CUARTEL_TXT="Cuartel";
	public static String BOMBEROS_TXT="Bomberos";
	public static String OTROS_TXT="Otros";
	
	public static String getTXT(int constante){
		switch (constante) {
		case 1: return HOSPITAL_TXT;
		case 2: return REFUGIO_TXT;
		case 3: return POLICIA_TXT;
		case 4: return CAMINERA_TXT;
		case 5: return CUARTEL_TXT;
		case 6: return BOMBEROS_TXT;
		case 7: return OTROS_TXT;
		default:
			return "";
		}
	}
	
	public static ArrayList<ItemConstante> getItems(){
		ArrayList<ItemConstante> res= new ArrayList<ItemConstante>();
		res.add(new ItemConstante(HOSPITAL, getTXT(HOSPITAL)));
		res.add(new ItemConstante(REFUGIO, getTXT(REFUGIO)));
		res.add(new ItemConstante(POLICIA, getTXT(POLICIA)));
		res.add(new ItemConstante(CAMINERA, getTXT(CAMINERA)));
		res.add(new ItemConstante(CUARTEL, getTXT(CUARTEL)));
		res.add(new ItemConstante(BOMBEROS, getTXT(BOMBEROS)));
		res.add(new ItemConstante(OTROS, getTXT(OTROS)));
		
		return res;
	}
}
