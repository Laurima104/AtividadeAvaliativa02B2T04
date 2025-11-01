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
		mostrarVagas();
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
			System.out.printf("\n%n - ", i + 1);
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
			
			break;
		case 4:
			
			break;
		default:
			System.out.println("Opção Invalida, por favor tente novamente");
			break;
		}
	}
}
