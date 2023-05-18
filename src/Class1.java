import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// calcular salario**
		
		//Salario da semana.
	Scanner LeitorNumero = new Scanner (System.in);
	Scanner LeitorLetra = new Scanner (System.in);
	double HorasTrabalhadas = 0;
	System.out.println("Digite as horas trabalhadas:");
	HorasTrabalhadas = LeitorNumero.nextDouble();
	double Salario = HorasTrabalhadas * 10;
    double HoraExtraSemana;
    System.out.println("O trabalhador fez horas extras na semana?");
    String Decisao = LeitorLetra.nextLine();
    
    if (Decisao.equals("Sim")) {
    
    
    System.out.println("Digite a quantidade de horas extras:");
    HoraExtraSemana = LeitorNumero.nextDouble();
    HoraExtraSemana = Salario * 0.5;
    Salario =  Salario + HoraExtraSemana;
    System.out.println("Salario e de: "+ Salario);
	
    
    
    

	}
    
    
    System.out.println("O trabalhador trabalhou final de semana?");
    Decisao = LeitorLetra.nextLine();
    if(Decisao.equals("Sim")) {
    	double HoraExtraFDS;
    	System.out.println("Quantas horas trabalhou?");
    	HoraExtraFDS = LeitorNumero.nextDouble();
    	HoraExtraFDS = Salario * 2;
    	Salario  =  Salario + HoraExtraFDS;
    	System.out.println("Valor a pagar: "+  Salario );
    }
    
    else {
    	System.out.println("Valor a pagar: " +Salario);
    }
    
}
	    
}    
	    
	    
	    

	
	
