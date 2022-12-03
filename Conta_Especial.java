package ATV7;

public class Conta_Especial extends ContaGenerica {
private double limite;

public Conta_Especial(String nomeTitular, int numConta, double limite) {
	this.nomeTitular = nomeTitular;
	this.numConta = numConta;
	this.limite = limite;
}

public double getLimite() {
	return limite;
}

public void setLimite(double limite) {
	this.limite = limite;
}
@Override
public void imprimirTipoConta() {
	System.out.println("Conta especial");
	
}

public void sacarDaConta(double valor) {
	if(limite < valor) {
		System.out.println("Saldo insuficiente");
	}else {
		this.limite -=valor;
		System.out.println("Seu novo saldo:" + limite);
		
	}
}
}
