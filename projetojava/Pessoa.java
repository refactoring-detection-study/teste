public class Pessoa2 {
	char sexo;
	String nome;
	double altura;
	double peso;
	String cpf;
	public Pessoa2(){
		this.sexo = 'f';
		this.nome = "sem nome";
		this.altura = 0;
		this.peso = 0;
		this.cpf = "indefinido";
	}
	public void setSexo(char sexo){
		this.sexo = sexo;
	}
	public char getSexo(){
		return sexo;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	public double getAltura(){
		return altura;
	}
	public void setPeso(double peso){
		this.peso = peso;
	}
	public double getPeso(){
		return peso;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public String getCpf(){
		return cpf;
	}
	public double getPesoIdeal(){
		double peso = Pessoa2.calculaPesoIdeal(this.altura, this.sexo);
		return peso;
	}
    public static double calculaPesoIdeal(double altura, char sexo){
    	if (sexo == 'M'){
    		return (72.7*altura) - 58;
    	} else { //sexo = 'F'
    		return (62.1*altura) - 44.7;
    	}
    }	
}