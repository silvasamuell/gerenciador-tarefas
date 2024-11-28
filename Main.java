package tarefas;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		ArrayList<String> array = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Adicionar tarefa");
			System.out.println("2 - Remover tarefa");
			System.out.println("3 - Remover todas as tarefas");
			System.out.println("4 - Salvar tarefas");
			System.out.println("5 - Listar tarefas");
			System.out.println("6 - Sair");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite a tarefa a ser adicionada:");
				String tarefa = scanner.nextLine();
				array.add(tarefa);
				break;

			case 2:
				System.out.println("Digite o índice da tarefa a ser removida (iniciado de 0):");
				int indice = scanner.nextInt();
				if (indice >= 0 && indice < array.size()) {
					array.remove(indice);
					System.out.println("Tarefa removida com sucesso");
				} else {
					System.out.println("Índice inválido");
				}
				scanner.nextLine();
				break;

			case 3:
				array.clear();
				System.out.println("Todas as tarefas foram removidas");
				break;

			case 4:
				FileWriter fileWriter = new FileWriter("C:/Users/Samuel/Desktop/tarefas.txt");
				PrintWriter printWriter = new PrintWriter(fileWriter);
				for (String x : array) {
					printWriter.println(x);
				}
				fileWriter.close();
				System.out.println("Tarefas salvas com sucesso");
				break;

			case 5:
				if (array.isEmpty()) {
					System.out.println("Nenhuma tarefa para listar");
				} else {
					System.out.println("Tarefas:");
					for (int i = 0; i < array.size(); i++) {
						System.out.println(i + ": " + array.get(i));
					}
				}
				break;

			case 6:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		} while (opcao != 6);

		scanner.close();
	}
}
