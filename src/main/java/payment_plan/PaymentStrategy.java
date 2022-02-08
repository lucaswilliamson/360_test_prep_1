package payment_plan;

public interface PaymentStrategy
{
	public double pay(double hours, double rate);
}
