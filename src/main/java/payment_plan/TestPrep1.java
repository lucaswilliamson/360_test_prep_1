package payment_plan;
import java.util.ArrayList;

public class TestPrep1
{

	public static void main(String[] args)
	{
		Company c = new Company();
		
		c.addEmployee(new Employee(new ContractorStrategy(), "Lucas",10));
		c.addEmployee(new Employee(new HourlyStrategy(),"Lane",12));
		c.addEmployee(new Employee(new SalaryStrategy(),"Lori",11));
		
		ArrayList<Employee> el = c.getEmployees();
		for(int i=0;i<el.size();i++)
		{
			el.get(i).setHours(50);
		}
		
		double[] paid = c.payEmployees();
		
		for(int i=0;i<paid.length;i++)
		{
			System.out.println(paid[i]);
		}
	}

}
