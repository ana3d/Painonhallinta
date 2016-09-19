package fi.antti.spring.bean;

public class Paino {

	int id;
	String aikaleima;
	double paino;

	public Paino() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paino(int id, String aikaleima, double paino) {
		super();
		this.id = id;
		this.aikaleima = aikaleima;
		this.paino = paino;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAikaleima() {
		return aikaleima;
	}

	public void setAikaleima(String aikaleima) {
		this.aikaleima = aikaleima;
	}

	public double getPaino() {
		return paino;
	}

	public void setPaino(double paino) {
		this.paino = paino;
	}

	@Override
	public String toString() {
		return "Paino [id=" + id + ", aikaleima=" + aikaleima + ", paino="
				+ paino + "]";
	}

}
