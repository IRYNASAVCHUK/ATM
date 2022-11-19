package test;

import static org.junit.Assert.*;
import org.junit.*;
import code.Business_logic.Euro;
import code.Database.Account;

public class TestAccount {

    private Account account;

@Before
public void init() {
   account = new Account(22008,99223,new Euro (4000.0), new Euro(4500.0));
}
@After
public void clear() {
	 account = null;
	 assertNull(account);
}

	@Test
	public void testValidatePIN() {
		assertTrue("pin errato",account.validatePIN(99223));
	}

	

	

}
