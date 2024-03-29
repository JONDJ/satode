package fing.satode.constantes;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.gwt.user.client.rpc.IsSerializable;

public class MaterialParedes implements Serializable, IsSerializable{

	private static final long serialVersionUID = 1L;

	public final static int LADRILLO=1;
	public final static int BLOQUE=2;
	public final static int MADERAYCHAPA=3;
	public final static int ADOBETERRONFAJINA=4;
	public final static int MATERIALDEDESECHO=5;
	public final static int LONAYNYLON=6;
	public final static int OTRO=7;
	
	
	public static String LADRILLO_TXT= "Ladrillo";
	public static String BLOQUE_TXT= "Bloque";
	public static String MADERAYCHAPA_TXT= "Madera y chapa";
	public static String ADOBETERRONFAJINA_TXT= "Adobe, terr\u00F3n, fajina";
	public static String MATERIALDEDESECHO_TXT= "Material de desecho";
	public static String LONAYNYLON_TXT= "Lona o nylon";
	public static String OTRO_TXT= "Otro";
	
	public static String getTXT(int constante){
		switch (constante) {
		case 1: return LADRILLO_TXT;
		case 2: return BLOQUE_TXT;
		case 3: return MADERAYCHAPA_TXT;
		case 4: return ADOBETERRONFAJINA_TXT;
		case 5: return MATERIALDEDESECHO_TXT;
		case 6: return LONAYNYLON_TXT;
		case 7: return OTRO_TXT;
		default:
			return "";
		}
	}
	
	public static ArrayList<ItemConstante> getItems(){
		ArrayList<ItemConstante> res= new ArrayList<ItemConstante>();
		res.add(new ItemConstante(LADRILLO, getTXT(LADRILLO)));
		res.add(new ItemConstante(BLOQUE, getTXT(BLOQUE)));
		res.add(new ItemConstante(MADERAYCHAPA, getTXT(MADERAYCHAPA)));
		res.add(new ItemConstante(ADOBETERRONFAJINA, getTXT(ADOBETERRONFAJINA)));
		res.add(new ItemConstante(MATERIALDEDESECHO, getTXT(MATERIALDEDESECHO)));
		res.add(new ItemConstante(LONAYNYLON, getTXT(LONAYNYLON)));
		res.add(new ItemConstante(OTRO, getTXT(OTRO)));
		
		return res;
	}
}
