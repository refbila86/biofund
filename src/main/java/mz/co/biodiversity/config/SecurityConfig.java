
package mz.co.biodiversity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {

        http
            .authorizeHttpRequests(auth -> auth

                // Public resources
                .requestMatchers(
                    "/login.xhtml",
                    "/javax.faces.resource/**",
                    "/jakarta.faces.resource/**",
                    "/css/**",
                    "/js/**",
                    "/images/**"
                ).permitAll()

                // All other pages require authentication
                .anyRequest().authenticated()
            )

            // CSRF configuration
            .csrf(csrf -> csrf
                .ignoringRequestMatchers(
                    "/dashboard.xhtml",
                    "/pages/**",
                    "/logout"  
                )
            )

            // Login configuration
            .formLogin(form -> form
                .loginPage("/login.xhtml")
                .loginProcessingUrl("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .defaultSuccessUrl("/dashboard.xhtml", true)
                .failureUrl("/login.xhtml?error=true")
                .permitAll()
            )

            // Logout configuration
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login.xhtml?logout=true")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID")
                .permitAll()
            );

        return http.build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
