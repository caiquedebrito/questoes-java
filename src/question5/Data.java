package question5;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void displayData() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}
}
