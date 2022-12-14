package question6;

public class CalculadoraCientifica extends Calculadora{
	public double raizQuadrada(int x) {
		return Math.sqrt(x);
	}
	
	public double potencia(double n, double expoente) {
		return Math.pow(n, expoente);
	}
}
