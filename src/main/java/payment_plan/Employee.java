package payment_plan;

public class Employee
{
	private PaymentStrategy p;
	private String name;
	private double hours;
	private double rate;

	
	public Employee(PaymentStrategy p, String name, double rate)
	{
		this.p = p;
		this.name = name;
		this.hours = 0;
		this.rate = rate;
	}

	public double pay()
	{
		return this.p.pay(this.hours, this.rate);
	}

	public PaymentStrategy getP()
	{
		return p;
	}

	public void setP(PaymentStrategy p)
	{
		this.p = p;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getHours()
	{
		return hours;
	}

	public void setHours(double hours)
	{
		this.hours = hours;
	}

	public double getRate()
	{
		return rate;
	}

	public void setRate(double rate)
	{
		this.rate = rate;
	}
	
	

}
