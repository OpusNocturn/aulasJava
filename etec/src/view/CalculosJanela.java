package view;

public class CalculosJanela {
	
	public double soma(double a , double b) {
		double resul;
		resul = a + b;
		return resul;
	}
	
	public double subtracao(double a , double b) {
		double resul;
		resul = a - b;
		return resul;
	}
	
	public double multiplicacao(double a , double b) {
		double resul;
		resul = a * b;
		return resul;
	}
	public double divisao(double a, double b) {
		double resul;
		resul =a/b;
		return resul;
	}
	
	public double raiz(double a) {
		double resul;
		resul = Math.sqrt(a);
		return resul;
		
	}
	
	public double porcentagem(double a, double b) {
		double resul;
		resul = (a * b) / 100;
		return resul;
	}


	public double maismenos(double a) {
		double resul;
		resul = a * (-1);
		return resul;
	}
	
	public double umx(double a) {
		double resul;
		resul = 1 / a;
		return resul;
	}
	
}