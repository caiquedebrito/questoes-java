package question8;

public class Motor {
	private int numCilindro;
	private int potencia;
	
	public Motor() {
		this.numCilindro = 0;
		this.potencia = 0;
	}
	
	public Motor(int numCilindro, int potencia) {
		this.numCilindro = numCilindro;
		this.potencia = potencia;
	}
	
	public int getNumCilindro() {
		return this.numCilindro;
	}
	
	public int getPotencia() {
		return this.potencia;
	}
	
	public void setNumCilindro(int numCilindro) {
		this.numCilindro = numCilindro;
	}
	
	public void getPotencia(int potencia) {
		this.potencia = potencia;
	}
}
