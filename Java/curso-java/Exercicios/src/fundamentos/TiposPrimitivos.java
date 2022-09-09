package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
	// informações do funcionario
		
		
	// Tipos numéricos inteiros
	byte anosDeEmpresa = 23;
	short numeroDeVoos = 542;
	int id = 56789;
	long pontosAcumulados = 3_134_845_224L; // Letra L maiuscula adicionada no final para mostrar o tipo Long
	
	// Tipos numéricos reais
	float salario = 11_445.45F; // Letra F maiuscula adicionada no final para mostrar o tipo Float 
	double vendasAcumuladas = 2_991_797_103.01;
	
	// Tipo Booleano
	boolean estadoDeFerias = false; // true
	
	// Tipo caractere
	char status = 'A'; // Qualquer valor vai ser interpretado como String, quando entre aspas!
	
	
	// Dias de empresa	
	System.out.println("Este funcionário esta registrado nesta empresa há "+ (anosDeEmpresa * 365) + ".");
	
	// Numero de viagens
	System.out.println("Este funcionário ja efetuou " + (numeroDeVoos / 2) + " viagens por nossa compania.");
	
	// Pontos por Real
	System.out.println("Levando se em consideração o Valor atual de ganhos, este funcionário acumulou " + (pontosAcumulados/vendasAcumuladas) + " pontos por Real conquistado");
	
	System.out.println(id+" : ganha por mês R$" + salario);
	System.out.println("Está de férias? = " + estadoDeFerias);
	System.out.println("Qualificação do recurso = " + status);
		
	}

}
