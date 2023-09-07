package com.devsam.housemanagement.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(11);
    }


    @Bean
    public DefaultSecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
         http
                .cors(cors -> cors.disable())

                .csrf(csrf-> csrf.disable())
                .authorizeHttpRequests((authorize)->authorize
                .requestMatchers("/register")
                .permitAll()
                )
                 .authorizeHttpRequests((authorize)->authorize
                         .requestMatchers("/all")
                         .hasAuthority("USER")
                         )
                .httpBasic(withDefaults());
                 return  http.build();




    }


}
