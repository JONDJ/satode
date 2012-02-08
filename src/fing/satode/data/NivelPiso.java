package fing.satode.data;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

public class NivelPiso implements Serializable, IsSerializable{

	private static final long serialVersionUID = 1L;

	public final static int PORDEBAJOCALLE=1;
	public final static int IGUALCALLE=2;
	public final static int RENCIMACALLE50CM=3;
	
	
	public static String PORDEBAJOCALLE_TXT= "Por debajo de la calle";
	public static String IGUALCALLE_TXT= "Igual al de la calle";
	public static String RENCIMACALLE50CM_TXT= "Por encima 50 cm del nivel de la calle";
	
	public static String getTXT(int constante){
		switch (constante) {
		case 1: return PORDEBAJOCALLE_TXT;
		case 2: return IGUALCALLE_TXT;
		case 3: return RENCIMACALLE50CM_TXT;
		default:
			return "";
		}
	}
}
