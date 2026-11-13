package mz.co.biodiversity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordTest {

    public static void main(String[] args) {

        BCryptPasswordEncoder encoder =
                new BCryptPasswordEncoder();

        String hash = "$2a$10$SNULcv4yleX2J0R10R7equu3Xcg9F1d1vjG6E/OIYDo3bJ7yGxEd2";

        System.out.println(
            encoder.matches("Admin123", hash)
        );
    }
}