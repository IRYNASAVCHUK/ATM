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

    @Test
	public void testCredit() {
		Euro euro = new Euro (200.0);
		account.credit(euro);
		long totBalance = 4700*100;
		assertEquals("accredito fallito",account.getTotalBalance().getValore(),totBalance);
	}


}
