package payment_plan;

public class HourlyStrategy implements PaymentStrategy
{

	@Override
	public double pay(double hours, double rate)
	{
		if(hours <= 40)
		{
			return hours*rate;
		}
		
		return 40*rate + (hours-40)*1.5*rate;
	}

}
