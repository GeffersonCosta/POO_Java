package empresa;

public class Euro extends Moeda{

	public Euro() {}
	public Euro(double valor) {
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
	public void info() {
		System.out.println("Euro - "+valor);
	}

	@Override
	public double Converter() {
		return 5.83 * valor;
	}

}
