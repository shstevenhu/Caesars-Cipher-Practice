package caesars.cipher;

public class Main {

	public static void main(String[] args) {

		String message = "What is up, geeks!";
		int offset = 10;
		
		CaesarsCipher caesarsCipher = new CaesarsCipher();
		String cipheredMessage = caesarsCipher.cipher(message, offset);

		System.out.println("Message: " + message);
		System.out.println("Offset: "+ offset);
		System.out.println("Ciphered Message: " + cipheredMessage);
	}

}
