package tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual operação deseja realizar?");
		System.out.println("1. Adicionar, 2. Remover, 3. Listar");
		int resposta = scanner.nextInt();
		
		ArrayList<String> tarefas = new ArrayList<String>();
		
		switch(resposta) {
		case 1:
			System.out.println("Qual seria a tarefa?");
			scanner.nextLine();
			String tarefa = scanner.nextLine();
			tarefas.add(tarefa);
			System.out.println(tarefa);
			break;
		}

		for (int i = 0; i < tarefas.size(); i++) {
			System.out.println(tarefas.get(i));
		}

		scanner.close();

	}

}
