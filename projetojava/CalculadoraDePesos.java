import java.util.Scanner;
public class CalculadoraDePesos2 {
	public static String quemEhAMulherMaisMagra(String [] nomes, double [] pesos){
		String nomeDaMulherMaisMagra = nomes[0];
		double menorPeso = pesos[0];
		for(int i =1; i < nomes.length; i++){
			if(pesos[i] < menorPeso){
				nomeDaMulherMaisMagra = nomes[i];
				menorPeso = pesos[i];
			}
		}
		return nomeDaMulherMaisMagra;
	}
	public static void main (String args[]){
		String [] mulhres = new String [] {"maria","ana"};
		double [] pesos = new double [] {50,30};
		String nomeDaMulherMenorPeso = CalculadoraDePesos2.quemEhAMulherMaisMagra(mulhres,pesos);
		System.out.println("nomeDaMulherMenorPeso "+nomeDaMulherMenorPeso);
		if( args.length == 0 ){
			System.out.println("Não foi passado argumento para o programa");
		}else{		
			Scanner leitor = new Scanner (System.in);
			System.out.println("CALCULADORA DE PESO IDEAL");
			System.out.println("Qual seu sexo? F ou M");
			String sexoString = leitor.nextLine();
			char sexo = sexoString.charAt(0);
			if( sexo == 'm' ||  sexo == 'f'){
				int quant = Integer.parseInt(args[0]);
				for(int i = 0; i < quant; i++){
					System.out.println("Qual sua altura?");
					double altura = Double.parseDouble(leitor.nextLine());
					double pesoIdeal = Pessoa2.calculaPesoIdeal(altura, sexo);
					System.out.println("Qual seu peso atual?");
					double pesoAtual = Double.parseDouble(leitor.nextLine());
					if (pesoAtual > pesoIdeal){
						System.out.println("Você está acima de seu peso ideal, que é de:"+pesoIdeal);
					} else if (pesoAtual == pesoIdeal){
						System.out.println("Você está com seu peso ideal");
					} else {
						System.out.println("Você está abaixo de seu peso ideal, que é de:"+pesoIdeal);
					}
				}
			}else{
				System.out.println("informação de sexo invalida");
			}
			leitor.close();
		}
	}
}