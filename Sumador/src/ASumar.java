
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
        if (numero.length() == 1) {
            numero = (numero + " = " + numero);
        }
        return numero;
        
	}

}
