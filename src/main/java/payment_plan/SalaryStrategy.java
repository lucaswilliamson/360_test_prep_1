package payment_plan;

public class SalaryStrategy implements PaymentStrategy
{

	@Override
	public double pay(double hours, double rate)
	{
		return 40*rate;
	}

}
