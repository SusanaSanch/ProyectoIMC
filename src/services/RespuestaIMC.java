package services;


public enum RespuestaIMC {DESNUTRIDO, BAJOPESO, NORMAL, SOBREPESO, OBESO;

public static RespuestaIMC traduceIMC (double imc) 
{
	RespuestaIMC devuelvo = null;
	
		if (imc<16)
			devuelvo = RespuestaIMC.DESNUTRIDO;
		else if (imc>=16 && imc<18.5) 
				devuelvo = RespuestaIMC.BAJOPESO;
			 else if (imc>=18.5 && imc < 25) 
				 	devuelvo = RespuestaIMC.NORMAL;
			 	  else if (imc>=25 && imc < 31) 
			 		  	devuelvo = RespuestaIMC.SOBREPESO;
			 	  else devuelvo = RespuestaIMC.OBESO;
	
	return devuelvo;
}

}
