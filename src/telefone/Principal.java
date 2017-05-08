package telefone;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira o nome de arquivo texto:");
		String nome = ler.nextLine();
		
		Arquivo.telefone(nome);
	}
}