package empresa;

public class Dolar extends Moeda{

	public Dolar() {}
	public Dolar(double valor) {
		super(valor);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	@Override
	void info() {
		System.out.println("Dolar - "+valor);
	}
	@Override
	double Converter() {
		return 5.44 * valor;
	}

}