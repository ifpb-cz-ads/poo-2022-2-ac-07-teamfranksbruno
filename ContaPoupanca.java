package ATV7;

public class ContaPoupanca extends ContaGenerica {
	
private double deposito;

public ContaPoupanca(String nomeTitular, int numConta) {
	this.nomeTitular = nomeTitular;
	this.numConta = numConta;
}
public double getDeposito() {
	return deposito;
}
public void setDeposito(double deposito) {
	this.deposito = deposito;
}
public double reajuste() {
	double soma;
	soma = this.deposito;
	soma*=0.5;
	this.deposito +=soma;
	return this.deposito;
}

@Override
public void imprimirTipoConta() {
	System.out.println("Conta Poupanca");
	
}
}