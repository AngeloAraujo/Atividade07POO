package Cone;

import java.util.Scanner;

public class Conemain {

	public static void main(String[] args) {
		Cone cone = new Cone ( );
		Scanner entrada=new Scanner (System.in);
	
		System.out.println("Digite o raio do cone a ser pintado: ");
		cone.setRaio(entrada.nextFloat());
	
		System.out.println("Digite o altura do cone a ser pintado: ");
		cone.setAltura(entrada.nextFloat());
	
		System.out.println("Escolha o tipo de tinta que voc� quer? 1-Tinta Clase1, 2-Tinta Classe2,3-Tinta Classe3");
		cone.setTinta(entrada.nextInt());
		
		System.out.println(cone);
		

		entrada.close();
		
	}

}
