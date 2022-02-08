package payment_plan;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompanyTest
{
	Company c;
	Employee e1;
	Employee e2;
	Employee e3;
	ArrayList<Employee> e;

	@BeforeEach
	void setUp() throws Exception
	{
		c = new Company();
		PaymentStrategy cs = new ContractorStrategy();
		PaymentStrategy hs = new HourlyStrategy();
		PaymentStrategy ss = new SalaryStrategy();
		
		e1 = new Employee(cs,"Alice",10);
		e2 = new Employee(hs,"Bob",11);
		e3 = new Employee(ss,"Charlie",12);
		
		
		e1.setHours(30);
		e2.setHours(30);
		e3.setHours(30);
		
		e = new ArrayList<Employee>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
	}

	@Test
	void testAddEmployee()
	{
		c.addEmployee(e1);
		c.addEmployee(e2);
		c.addEmployee(e3);
		
		assertEquals(e,c.getEmployees());
	}

	@Test
	void testPayEmployees()
	{
		c.addEmployee(e1);
		c.addEmployee(e2);
		c.addEmployee(e3);
		
		double[] d1 = {e1.pay(), e2.pay(), e3.pay()};
		double[] d2 = c.payEmployees();
		
		assertArrayEquals(d1, d2);
	}

}
