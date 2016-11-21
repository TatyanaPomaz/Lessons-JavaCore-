import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import strategy.*;


public class MainTest {
	private ShoppingCart cart;
	
	@Before
	public void setUp() {
		cart = new ShoppingCart();
		cart.addBook("Head First Design Patterns", 30.0);
		cart.addBook("Head First Java", 30.0);
		cart.addBook("Java for dummies", 20.0);
	}
	
	@Test
	public void test_api() {
		ShoppingCart cart = new ShoppingCart();
		cart.addBook("Head First Design Patterns", 30.0);
		cart.addBook("Head First Java", 30.0);
		cart.addBook("Java for dummies", 20.0);
		
		cart.pay(new PaymentStrategy() {
			public void pay(double total) {
				
			}
		});
	}
	
	@Test
	public void paymentStrategy_payMethod_shouldBeCalled_whenCartPayMethodIsCalled() {
		boolean[] callAttempt = {false};
		
		cart.pay(new PaymentStrategy() {
			public void pay(double total) {
				callAttempt[0] = true;
			}
		});
		
		assertThat(callAttempt[0], is(true));
	}
	
	@Test
	public void paymentStrategy_payMethod_shouldRecieveCorrectTotalValue() {
		double[] totalValue = {0.0};
		
		cart.pay(new PaymentStrategy() {
			public void pay(double total) {
				totalValue[0] = total;
			}
		});
		
		assertThat(totalValue[0], is(30.0 + 30.0 + 20.0));
	}
	
	@Test
	public void payPalPaymentStrategy_api() {
		cart.pay(new PayPalPaymentStrategy("email@examole.com",  "Books", 100.00));
	}
}