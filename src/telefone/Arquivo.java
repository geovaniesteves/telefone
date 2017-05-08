package telefone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {
	public static void telefone(String nome) throws IOException {
		try {
			BufferedReader arq = new BufferedReader(new FileReader(nome));
			String expressao = arq.readLine();

			while (expressao != null) {
				converteExpressao(expressao);
				expressao = arq.readLine();
			}

			arq.close();
		} catch (FileNotFoundException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
	}

	private static void converteExpressao(String expressao) {
		if ((expressao.length() > 0) && (expressao.length() < 31)) {

			String numTel = "";
			int contador = 0;
			for (int i = 0; i < expressao.length(); i++) {

				switch (expressao.charAt(i)) {
				case '0':
					numTel += '0';
					break;
				case '1':
					numTel += '1';
					break;
				case '-':
					numTel += '-';
					break;
				case 'A':
					numTel += '2';
					break;
				case 'B':
					numTel += '2';
					break;
				case 'C':
					numTel += '2';
					break;
				case 'D':
					numTel += '2';
					break;
				case 'E':
					numTel += '3';
					break;
				case 'F':
					numTel += '3';
					break;
				case 'G':
					numTel += '3';
					break;
				case 'H':
					numTel += '4';
					break;
				case 'I':
					numTel += '4';
					break;
				case 'J':
					numTel += '4';
					break;
				case 'K':
					numTel += '5';
					break;
				case 'L':
					numTel += '5';
					break;
				case 'M':
					numTel += '6';
					break;
				case 'N':
					numTel += '6';
					break;
				case 'O':
					numTel += '6';
					break;
				case 'P':
					numTel += '7';
					break;
				case 'Q':
					numTel += '7';
					break;
				case 'R':
					numTel += '7';
					break;
				case 'S':
					numTel += '7';
					break;
				case 'T':
					numTel += '8';
					break;
				case 'U':
					numTel += '8';
					break;
				case 'V':
					numTel += '8';
					break;
				case 'W':
					numTel += '9';
					break;
				case 'X':
					numTel += '9';
					break;
				case 'Y':
					numTel += '9';
					break;
				case 'Z':
					numTel += '9';
					break;
				default:
					contador += 1;
				}
			}
			if (contador != 0)
				System.out.println("A expressao \"" + expressao + "\" possui caractere invalido.");
			else
				System.out.println(numTel);
		} else
			System.out.println("A expressao \"" + expressao + "\" tem quantidade de caracteres invalida.");
	}
}
