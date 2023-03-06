package entities;

public class Triangle {

	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public double area() {
		double semiperimetro = (ladoA + ladoB + ladoC) / 2.0;
		return Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
	}
}
