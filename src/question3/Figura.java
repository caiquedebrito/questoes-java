package question3;

public class Figura {
	private int width;
	private int height;
	private int area;
	
	public Figura(int i, int j) {
		this.width = i;
		this.height = j;
	}
	
	public void area() {
		this.area = this.width * this.height;
	}
	
	public void mostrar() {
		System.out.println(this.area);
	}
	
	public void main(String[] args) {
		Circulo circulo = new Circulo(20, 20);
		circulo.area();
		circulo.mostrar();
	}
}
