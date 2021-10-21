import java.util.Scanner;

public class Cone2 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		float raio = 0;
		float altura = 0;
		int tinta = 0;

		AtividadeCone2 ex1=new AtividadeCone2(raio, altura, tinta);
		System.out.println("Digite o raio: ");
		raio=entrada.nextFloat();
		System.out.println("Digite a altura: ");
		altura= entrada.nextFloat();
		System.out.println("Insira o tipo de tinta: ");
		tinta=entrada.nextInt();
		
		ex1.setRaio(raio);
		ex1.setAltura(altura);
		ex1.setTinta(tinta);
		
		AtividadeCone2 ex2=new AtividadeCone2(6, 8, 1);
		
		raio =(float) 3.5;
		altura= 9;
		tinta=2;
		AtividadeCone2 ex3=new AtividadeCone2(raio, altura, tinta);
		
		System.out.println(ex1);
		System.out.println(ex2);
		System.out.println(ex3);
		
		entrada.close();
		
		
		
	}
	

}
