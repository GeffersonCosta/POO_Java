package empresa;

public class Real extends Moeda{

	public Real() {}
	public Real(double valor) {
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
		System.out.println("Real - "+valor);
	}
	@Override
	public double Converter() {
		return valor;
	}

}
