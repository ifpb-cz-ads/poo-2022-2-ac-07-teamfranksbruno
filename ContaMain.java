package ATV7;
import java.io.*;
import java.util.*;


public class ContaMain {
	public static void main(String [] args) throws NumberFormatException, IOException {
		int teclado;
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bem-vindo ao atendimento caixa, senhor Bruno Severo Cabral ");
		System.out.println("Digite 1 para acessar sua conta especial");
		System.out.println("Digite 2 para acessar sua conta poupança");
		teclado = Integer.parseInt(bfr.readLine());
		switch(teclado) {
		case 1:
			Conta_Especial ce = new Conta_Especial("Bruno Severo Cabral", 123456, 100000);
			ce.imprimirTipoConta();
			ce.sacarDaConta(300);
			System.out.println("Seu novo saldo:" + ce.getLimite());
			System.out.println("Nome do cliente:" + ce.getNomeTitular());
			System.out.println("Numero da conta" + ce.getNumConta());
			break;
		
		case 2:
			ContaPoupanca cp = new ContaPoupanca("Bruno Severo Cabral", 123456);
			cp.imprimirTipoConta();
			cp.setDeposito(1000);
			System.out.println("Seu deposito:" + cp.getDeposito());
			System.out.println("Nome do cliente:" + cp.getNomeTitular());
			System.out.println("Numero da conta" + cp.getNumConta());
			System.out.println("reajuste automatico da conta:" + cp.reajuste());
			System.out.println("Sua conta poupanca atual:" + cp.getDeposito());
			break;
		}
	}
}
