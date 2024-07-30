package com.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.password.CompromisedPasswordChecker;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.password.HaveIBeenPwnedRestApiPasswordChecker;

import javax.sql.DataSource;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().permitAll());
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().denyAll());
        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("/myAccount", "/myBalance", "/myCards", "/myLoans").authenticated()
                .requestMatchers("/notices", "/contact", "/error ").permitAll()
        );

//        the below code disables formlogin and httpBasic and also gives 403 error
//        http.formLogin(httpSecurityFormLoginConfigurer -> );
//        http.formLogin(flc -> flc.disable());
//        http.httpBasic(hbc -> hbc.disable());

        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        return http.build();
    }

    //    to configure userDetailsService below is the code
    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource) {
//        the below code is commenting because in section 4 we created userDetails inside the database so its not necessary to use this code anymore

//        UserDetails user = User.withUsername("user")
//                .password("{noop}user_@12345")
//                .authorities("read")
//                .build();
//        UserDetails admin = User.withUsername("admin")
////                the below password is encrypted Hash code of BCrypt and used prefix {bcrypt} its good practice to use prefix
////                as we used compromisedPasswordChecker method we changed the below admin password as "admin_@1122" and encrypted it
//                .password("{bcrypt}$2a$12$mNWjGgxh3ep8zOcoCsgl1.i6cC.a0MkfusKiQZoYobJvm3i16pXY6")
//                .authorities("admin")
//                .build();

//        instead of returning below code as we're using jdbc dependency, so we can return other code as returned below the commented code

//        return new InMemoryUserDetailsManager(user, admin);

        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
//    this below method not allows to create simple passwords to the users which may hack by the hackers
//    this features introduces from SpringSecurity 6.3 version
    public CompromisedPasswordChecker compromisedPasswordChecker(){
        return new HaveIBeenPwnedRestApiPasswordChecker();
    }
}

