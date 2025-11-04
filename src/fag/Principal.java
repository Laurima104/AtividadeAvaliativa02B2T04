package fag;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import fag.objetos.Carros;

public class Principal {
	
	static List<Carros> vagas = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		popularVagas();
		menu();
	}
	
	public static void popularVagas() {
		Carros carro = new Carros("SpaceFox", 2004, "branco");
		Carros carroDois = new Carros("VoxMachina", 2023, "vermelho");
		Carros carroTrez = new Carros("TransMovel", 2021, "rosa");
		vagas.add(carro);
		vagas.add(carroDois);
		vagas.add(carroTrez);
	}

	public static void mostrarVagas() {
		for(int i=0; i<vagas.size(); i++) {
			System.out.printf("\n %d - ", i+1);
			vagas.get(i).carro();
		}
		System.out.println("\n");
	}
	
	public static void cadastrarCarro() {
		Carros carro = new Carros();
		System.out.println("Entre com o Modelo do Veiculo");
		carro.setModelo(scan.nextLine());
		System.out.println("Entre com o Ano do Veiculo");
		carro.setAno(scan.nextInt());
		scan.nextLine();
		System.out.println("Entre com o Cor do Veiculo");
		carro.setCor(scan.nextLine());
		vagas.add(carro);
		System.out.println("Cadastro Realizado com Sucesso!");
	}
	
	public static void alterarCarro() {
		mostrarVagas();
		System.out.println("Selecione o carro a ser alterado");
		int choice = scan.nextInt();
		scan.nextLine();
		if(choice-1>=0 && choice-1<vagas.size()) {
			Carros carro = vagas.get(choice-1);
			System.out.println("Entre com o Modelo do Veiculo");
			carro.setModelo(scan.nextLine());
			System.out.println("Entre com o Ano do Veiculo");
			carro.setAno(scan.nextInt());
			scan.nextLine();
			System.out.println("Entre com o Cor do Veiculo");
			carro.setCor(scan.nextLine());
			vagas.set(choice-1, carro);
			System.out.println("Alteração Realizado com Sucesso!");
		} else {
			System.out.println("Opção Invalida, por favor tente novamente");
		}
	}
	
	public static void menu() {
		int opt = 0;
		do {
			System.out.println("---------Menu---------");
			System.out.println("0 - Fechar");
			System.out.println("1 - Cadastrar Veiculo");
			System.out.println("2 - Mostrar Veiculos");
			System.out.println("3 - Atualizar Veiculos");
			System.out.println("4 - Remover Veiculo");
			System.out.println("5 - Filtrar por Modelo");
			System.out.println("6 - Filtrar por Cor");
			System.out.println("Selecione a opção desejada");
			opt = scan.nextInt();
			scan.nextLine();
			opcoes(opt);
		} while(opt!=0);
	}
	
	public static void opcoes(int opt) {
		switch(opt) {
		case 0:
			System.out.println("Sistema Encerrado");
			break;
		case 1:
			cadastrarCarro();
			break;
		case 2:
			mostrarVagas();
			break;
		case 3:
			alterarCarro();
			break;
		case 4:
			removerVeiculo();
			break;
		case 5:
			filtrarModelo();
			break;
		case 6:
			filtrarCor();
			break;
		default:
			System.out.println("Opção Invalida, por favor tente novamente");
			break;
		}
	}
	
	private static void filtrarModelo() {
		System.out.println("Digite o Modelo que deseja filtrar da lista");
		String model = scan.nextLine();
		for(int i=0; i<vagas.size(); i++) {
			if(vagas.get(i).getModelo().equals(model)) {
				System.out.printf("\n %d - ", i+1);
				vagas.get(i).carro();
			}
		}
		System.out.println("\n");
	}

	private static void filtrarCor() {
		System.out.println("Digite a Cor que deseja filtrar da lista");
		String color = scan.nextLine();
		for(int i=0; i<vagas.size(); i++) {
			if(vagas.get(i).getCor().equals(color)) {
				System.out.printf("\n %d - ", i+1);
				vagas.get(i).carro();
			}
		}
		System.out.println("\n");
	}
	
	private static void removerVeiculo() {
		System.out.println("0 - Cancelar operação");
		mostrarVagas();
		System.out.println("Selecione o carro a ser removido");
		int choice = scan.nextInt();
		scan.nextLine();
		if(choice-1>=0 && choice-1<vagas.size()) {
			vagas.remove(choice-1);
			System.out.println("Veiculo Removido com Sucesso!");
		} else if(choice-1 == -1) {
			System.out.println("Operação Cancelada");
		} else {
			System.out.println("Opção Invalida, por favor tente novamente");
		}
	}
}
