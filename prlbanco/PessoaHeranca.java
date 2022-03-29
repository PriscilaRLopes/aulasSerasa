package prlbanco;

public class PessoaHeranca {

	private String nome;
	private String telefone;
	private String email;
	
	public void PessoaHerança(){
		//metodo construtor defaut=preenchimento dos atributos é opcional
	}
			
	public PessoaHeranca(String nome,String email, String telefone) {
		
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getTelefone() {
			return telefone;
		}


		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}
	
		
	
	
}
