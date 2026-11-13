package mz.co.biodiversity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator
{

	public static void main(String[] args)
	{

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String hash = encoder.encode("Admin123");

		System.out.println("Novo hash: " + hash);

		System.out.println("Validacao: " + encoder.matches("Admin123", hash));
	}
}