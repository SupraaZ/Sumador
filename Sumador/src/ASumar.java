
public class ASumar {

	private String valor_inicial;

	/**
	 * 
	 * @param string 
	 */
	public ASumar(String string) {
		// TODO Auto-generated constructor stub
		this.valor_inicial = string;
	}

	/**
	 * 
	 * @return Devuelve el resultado
	 */
	public String mostrar() {
		// TODO Auto-generated method stub
		String numero = valor_inicial;
		int suma=0;
		
		
        if (numero.length() == 1) {
            numero = (numero + " = " + numero);}
        
        int numEntero = Integer.parseInt(valor_inicial);
        
		if (numEntero < 0) { 
			numero = "negativo";}
		
        return numero;

        
        
	}
	
	
	 public int total() {
		 
	        int suma = 0;
	        for (int i = 0; i < valor_inicial.length(); i++) {
	        	
	            String digito = valor_inicial.substring(i, 1);
	            suma = suma + Integer.getInteger(digito);
	        }
	        return suma;

	    }

}
