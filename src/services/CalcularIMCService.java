package services;


public class CalcularIMCService {
	
	
	public static String calculaIMC (double peso, double altura)
	{
		double imc = 0;
		RespuestaIMC respuestaIMC = null;
		String respuesta_completa = "";
			
			imc = Math.round((peso/(altura*altura))*100.0)/100.0;
			respuestaIMC = RespuestaIMC.traduceIMC(imc);
			
			
			respuesta_completa = ("SU IMC ES " + imc +" que es " + respuestaIMC);
			
		return respuesta_completa;
	}

}
