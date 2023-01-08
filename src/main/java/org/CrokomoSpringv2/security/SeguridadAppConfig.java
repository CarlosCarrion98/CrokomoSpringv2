package org.CrokomoSpringv2.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.*;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SeguridadAppConfig {
	
	
	
	@Bean 
	public PasswordEncoder passwordEncoder() { 
	    return new BCryptPasswordEncoder(); 
	}
	
	@Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user1 = User.withUsername("user1")
            .password(passwordEncoder().encode("user1Pass"))
            .roles("USER")
            .build();
        UserDetails user2 = User.withUsername("user2")
            .password(passwordEncoder().encode("user2Pass"))
            .roles("USER")
            .build();
        UserDetails admin = User.withUsername("admin")
            .password(passwordEncoder().encode("adminPass"))
            .roles("ADMIN")
            .build();
        return new InMemoryUserDetailsManager(user1, user2, admin);
    }
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests().anyRequest().authenticated().and()
		.formLogin().loginPage("/inicio-sesion").loginProcessingUrl("/autenticacionUsuario").permitAll();
		
		return http.build();
		
	}
	
}
