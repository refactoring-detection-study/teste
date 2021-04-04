
public class GerenteDePessoas2 {
	Pessoa2 [] pessoa;
	int quant;
	public GerenteDePessoas2(){
		this.pessoa = new Pessoa2[500];
		this.quant = 0;
	}
	public Pessoa2 pesquisaPessoa(String cpf){
		return pessoa(cpf);
	}
    private Pessoa2 pessoa(String cpf) {
        for(int i=0; i < quant; i++){
			if(this.pessoa[i].getCpf().equals(cpf)){
				return pessoa[i];
			}
		}
		return null;
    }
	public int pesquisaQuantidadeDePessoasDoSexo(char sexo){
		int quantSexo =0;
		for(int i =0; i < quant; i++ ){
			if(this.pessoa[i].getSexo() == sexo){
				quantSexo++;
			}
		}
		return quantSexo;
	}
	public int pesquisaQuantidadeDePessoasComNomeComecandoCom(String inicioNome){
		int quantPessoa = 0;
		for(int i=0;i<quant; i++){
			if(this.pessoa[i].getNome().startsWith(inicioNome)){
				quantPessoa++;
			}
		}
		return quantPessoa;
	}
	public int pesquisaQuantidadeDePessoasAcimaDoPesoIdeal(){
		return quantidadeDePessoasAcimaDoPesoIdeal();
	}
    private int quantidadeDePessoasAcimaDoPesoIdeal() {
        int quantpessoaAcimaDoPeso =0;
		for(int i=0; i<quant; i++){
			if(this.pessoa[i].getPeso() > pessoa[i].getPesoIdeal()){
				System.out.println("Você está acima de seu peso ideal");
				quantpessoaAcimaDoPeso++;
			}
		}
		return quantpessoaAcimaDoPeso;
    }
	public Pessoa2 quemEhAPessoaMaisMagra(){
		for(int i=0; i<quant; i++){
			if(this.pessoa[i].getPeso() < pessoa[i].getPesoIdeal()){
				return pessoa[i];
			}
		}
		return null;	
	}
	public boolean cadastraPessoa(Pessoa2 GerenteDePessoa2){
		if(quant == 500){
			return false;
		}else{
			for(int i=0; i<quant; i++){
				if(pessoa[i].getCpf().equals(GerenteDePessoa2.getCpf())){
					return false;
				}
			}
		}
		pessoa[quant] = GerenteDePessoa2;
		quant++;
		return true;
	}
}
