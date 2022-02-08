package payment_plan;
import java.util.ArrayList;

public class Company
{
	private ArrayList<Employee> employees;
	
	public Company()
	{
		this.employees = new ArrayList<Employee>();
	}
	
	public Company(ArrayList<Employee> employees)
	{
		this.employees = employees;
	}

	public void addEmployee(Employee e)
	{
		this.employees.add(e);
	}
	
	public ArrayList<Employee> getEmployees() //not a clone!
	{
		return employees;
	}
	

	public double[] payEmployees()
	{
		double[] payments = new double[this.employees.size()];
		for(int i=0;i<this.employees.size();i++) 
		{
			payments[i] = employees.get(i).pay();
		}
		return payments;
	}
}
