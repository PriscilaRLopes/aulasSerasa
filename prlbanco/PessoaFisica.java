package prlbanco;

public class PessoaFisica extends PessoaHeranca{
	
	public PessoaFisica(String nome, String email, String telefone) {
		super(nome, email, telefone);
		// TODO Auto-generated constructor stub
	}
	private String cpf;
	private String rg;
	private String profissao;
	 
	
	
	public PessoaFisica(String nome, String email, String telefone, String cpf, String rg, String profissao) {
		super(nome, email, telefone);
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
	

}
