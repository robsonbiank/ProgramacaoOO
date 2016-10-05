package lista001;

public class ContaCorrente {
	
	// ATRIBUTOS
	
		int numeroConta;
		String correntista;
		Float saldo;
		
	// FIM ATRIBUTOS
		
	// CONSTRUTOR
		
		public ContaCorrente(int numeroConta, String correntista){
			this.numeroConta = numeroConta;
			this.correntista = correntista;
			
			if(correntista != null ){
				System.out.println("Campo não pode ser nulo.");
			}else{
				this.correntista = correntista;
			}
			
			if(saldo > 0){
				this.saldo=saldo;
			}else{
				System.out.println("Saldo não pode ser menor que zero.");
			}
			
		}
		
		// FIM CONSTRUTOR
		
		// GETS E SETS
		
		public int getNumeroConta(){
			return numeroConta;
		}
		
		public void setNumeroConta(int NumeroConta){
			if(numeroConta >= 0 ){
				this.numeroConta = numeroConta;
			}else{
				System.out.println("Número da Conta não pode ser menor que zero.");
			}
		}
		
		// FIM GETS E SETS

}
