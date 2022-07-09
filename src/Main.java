import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual é o tipo de modal? \n 1 - Terrestre 2 - Aquatico 3 - Aereo?");
		int op  = leitor.nextInt();
		
		System.out.println("Quando você fará o deslocamento?  DD/MM/YYYY");
		String data = leitor.next();
		
		System.out.println("Quantas pessoas da sua família vão te acompanhar?");
		int pessoas = leitor.nextInt();	
		
		if(op==1) {
			System.out.println("Opções: 1 - ônibus(R$12), 2 - carro(R$30), 3 - trem(R$5)");
			int opT = leitor.nextInt();
			if(opT==1) {
				float valorTotalO = (12)*pessoas; 
					System.out.print("O modal utilizado será: Terrestre: ônibus, a data da viagem será "+ data+ " serão " + pessoas +" pessoas" + " O valor total da passagem será "+valorTotalO);				
			}
			else if(opT==2) {
				float valorTotalC = (30)* pessoas;
				System.out.print("O modal utilizado será: Terrestre: carro, a data da viagem será "+ data+ " serão " + pessoas +" pessoas" + " O valor total da passagem será "+valorTotalC);
			}
			else if(opT==3) {
				float valorTotalT = (5)* pessoas;
				System.out.print("O modal utilizado será: Terrestre: Trem, a data da viagem será "+ data+ " serão " + pessoas +" pessoas" + " O valor total da passagem será "+valorTotalT);
			}
		}
		
		else if(op==2) {
			System.out.println("Opções: 4 - Iate(R$3400), 5 - Navio(R$2000), 6 - Barco(R$400)");
			int opAq = leitor.nextInt();
			if(opAq==4) {
				float valorTotalI = (3400)*pessoas;
				System.out.print("O modal utilizado será: Aquatico: Iate, a data da viagem será "+ data+ " serão " + pessoas +" pessoas" + " O valor total da passagem será "+valorTotalI);
			
			}
			else if(opAq==5) {
				float valorTotalN = (2000)*pessoas;
				System.out.print("O modal utilizado será: Aquatico: Navio, a data da viagem será "+ data+ " serão " + pessoas +" pessoas" + " O valor total da passagem será "+valorTotalN);
			}
			else if(opAq==6) {
				float valorTotalB = (400)*pessoas;
				System.out.print("O modal utilizado será: Aquatico: Barco, a data da viagem será "+ data+ " serão " + pessoas +" pessoas" + " O valor total da passagem será "+valorTotalB);
			}
		}
		
		
		else if(op==3) {
			System.out.println("Opções: 7 - Avião(R$1200), 8 - Helicóptero(R$1500), 9 - Jato particular(R$2220)");
			int opAe = leitor.nextInt();
			if(opAe==7) {
				float valorTotalA = (1200)*pessoas;
				System.out.print("O modal utilizado será: Aereo: Avião, a data da viagem será "+ data+ " serão " + pessoas +" pessoas" + " O valor total da passagem será "+valorTotalA);
			}
			else if(opAe==8) {
				float valorTotalH = (1500)*pessoas;
				System.out.print("O modal utilizado será: Aereo: Helicóptero, a data da viagem será "+ data+ " serão " + pessoas +" pessoas" + " O valor total da passagem será "+valorTotalH);
			}
			else if(opAe==9) {
				float valorTotalJ = (2200)*pessoas;
				System.out.print("O modal utilizado será: Aereo: Jato particular, a data da viagem será "+ data+ " serão " + pessoas +" pessoas" + " O valor total da passagem será "+valorTotalJ);
			}
		}



	}

}
