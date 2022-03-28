package exam;

public class Won2Dollar extends Converter {

	private double price; 
	Won2Dollar (double val){
		this.price=val;
	}
	
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		double res = src/1200;
		return res;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}

}
