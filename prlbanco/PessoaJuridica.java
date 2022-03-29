package prlbanco;

public class PessoaJuridica extends PessoaHeranca{
	
	public PessoaJuridica(String nome, String email, String telefone) {
		super(nome, email, telefone);
		// TODO Auto-generated constructor stub
	}
	private String cnpj;
	private String segmento;
	private String responsavel;
	
	
	public PessoaJuridica(String nome, String email, String telefone, String cnpj, String segmento,
			String responsavel) {
		super(nome, email, telefone);
		this.cnpj = cnpj;
		this.segmento = segmento;
		this.responsavel = responsavel;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	

}
