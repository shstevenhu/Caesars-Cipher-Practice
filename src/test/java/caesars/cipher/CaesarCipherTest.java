package caesars.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {

	private CaesarsCipher caesarCipher = new CaesarsCipher();
	
	@Test
	void testCipheredMessageWithOffsetOf10() {
		assertEquals("arkd sc ezP qooucE", caesarCipher.cipher("What is up, geeks!", 10));
	}

	@Test
	void testEmptyString() {
		assertEquals("", caesarCipher.cipher("", 10));
	}
	

}
