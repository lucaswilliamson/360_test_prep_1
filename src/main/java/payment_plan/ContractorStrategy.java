package payment_plan;

public class ContractorStrategy implements PaymentStrategy
{

	@Override
	public double pay(double hours, double rate)
	{
		return hours*rate;
	}

}
