package ATV7;

public abstract class ContaGenerica {

protected int numConta;
protected String agencia;
protected String nomeTitular;



public void setNumConta(int numConta) {
	this.numConta = numConta;

}
public int getNumConta() {
	return numConta;
}

public void setAgencia(String agencia) {
	this.agencia = agencia;
	
}
public String getAgencia() {
	return agencia;
}

public void setNomeTitular(String nomeTitular) {
	this.nomeTitular = nomeTitular;
	
}
public String getNomeTitular() {
	return nomeTitular;
}

public void imprimirTipoConta() {
	System.out.println("Conta generica  Abstrata");
}
}
