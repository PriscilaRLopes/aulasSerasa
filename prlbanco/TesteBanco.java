package prlbanco;

public class TesteBanco {
	
	public static void main(String[] args) {
		
		//Pessoa pessoaNumero1 = new Pessoa();//criar uma instancia = cópia
		//pessoaNumero1.nome= "Jose das Couves";
		//pessoaNumero1.profissao = "Agricultor";
		//pessoaNumero1.cpf = "643.829.641-48";
		
		//System.out.println("Nome: "+pessoaNumero1.nome);
		//System.out.println("Profissão: "+pessoaNumero1.profissao);
		//System.out.println("CPF: "+pessoaNumero1.cpf);
		
		//System.out.println("========================");
		
		//Pessoa pessoaNumero2 = pessoaNumero1;
		//pessoaNumero2.nome = "João dos Tomates";
		//System.out.println("Nome: "+pessoaNumero2.nome);
				
	//
		//}
	//

		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		//conta1.setSaldo(50000);>> não se deve alterar diretamente essa informação.Ela apenas pode ser exibida
		conta1.setTitular("Priscila");
		conta1.depositar(10000.0);
		
		
		System.out.println("Agencia:"+conta1.getAgencia());
		System.out.println("Numero da conta:"+conta1.getNumeroConta());
		System.out.println("Titular: "+conta1.getTitular());
		System.out.printf("Saldo Atual: R$ %.2f\n",conta1.getSaldo());
		
				
		if (conta1.sacar(20.0)) {
			System.out.println("Saque efetuado com sucesso!");
			
		}else {
			System.out.println("Verifique o valor do Saldo!");
		}
		System.out.printf("Saldo Atual: R$ %.2f\n",conta1.getSaldo());
		
		Conta conta2= new Conta();
		conta2.setAgencia(5582);
		conta2.setNumeroConta(2234);
		
		conta1.transferir(5200.0, conta2);
		System.out.printf("Saldo Atual Priscila: R$ %.2f\n",conta1.getSaldo());
		System.out.printf("Saldo Atual Destinatario: R$ %.2f\n",conta2.getSaldo());
		
		
		
		

		
	}

}
