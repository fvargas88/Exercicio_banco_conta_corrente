 package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Conta conta;
		
		System.out.print("Insira o número da conta: ");
		int numero = sc.nextInt();
		System.out.println("Digite o nome do titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Tem deposito inicial? (s/n)");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.println("Entre com o deposito inicial: ");
			double depositoInicial = sc.nextDouble(); 
			conta = new Conta(numero, titular,depositoInicial);
			
		}else {
			conta = new Conta (numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Deposite um valor: ");
		double valorDepositado = sc.nextDouble();
		conta.deposito(valorDepositado);
		System.out.println("Dados atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Saque um valor: ");
		double valorSacado = sc.nextDouble();
		conta.deposito(valorSacado);
		System.out.println("Dados atualizados: ");
		System.out.println(conta);
		
		
		
		
		sc.close();

	}

}
