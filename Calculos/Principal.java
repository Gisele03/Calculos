package Calculos;

public class Principal {

	public static void main(String[] args) {
		Adicionar adicionar = new Adicionar();
		System.out.println("Soma");
		System.out.println(adicionar.somar(5, 3));
		
		Subtrair subtrair = new Subtrair();
		System.out.println("Subtração");
		System.out.println(subtrair.sub(5, 3));
		
		Calcular calcular = new Calcular();
		System.out.println("Divisão");
		System.out.println(calcular.div(5, 3));
		
		Calcular calcular1 = new Calcular();
		System.out.println("Multiplicação");
		System.out.println(calcular1.multi(5, 3));
		
		Expo expo = new Expo();
		System.out.println("Expoente");
		System.out.println(expo.exp(5, 3));
	
	}

}
