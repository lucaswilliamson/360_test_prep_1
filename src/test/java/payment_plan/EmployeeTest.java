package payment_plan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest
{
	Employee e1;
	@BeforeEach
	void setUp() throws Exception
	{
		PaymentStrategy cs = new ContractorStrategy();
		
		e1 = new Employee(cs,"Alice",10);

	}

	@Test
	void testPay()
	{
		e1.setHours(30);
		assertEquals(300,e1.pay());
		
		e1.setHours(40);
		assertEquals(400,e1.pay());
		
		e1.setHours(50);
		assertEquals(500,e1.pay());
		
		PaymentStrategy hs = new HourlyStrategy();
		e1.setP(hs);
		
		e1.setHours(30);
		assertEquals(300,e1.pay());
		
		e1.setHours(40);
		assertEquals(400,e1.pay());
		
		e1.setHours(50);
		assertEquals(550,e1.pay());
		
		PaymentStrategy ss = new SalaryStrategy();
		e1.setP(ss);
		
		e1.setHours(30);
		assertEquals(400,e1.pay());
		
		e1.setHours(40);
		assertEquals(400,e1.pay());
		
		e1.setHours(50);
		assertEquals(400,e1.pay());
		
	}

}
