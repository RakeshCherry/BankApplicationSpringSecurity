if we not use encoder it will be saved as plane text in the brower memory or storage

 # PasswordEncoder 
    * method
    * not accept anyInput
    * it impliments many methods
 # PasswordEncoderFactories
    * method
    * it has many other password encoders like below
        a. SCrypt
        b. BCrypt
        c. Pbkdf2 etc
    * In these BCryptPasswordEncoder is a defalut method

 # BCryptPasswordEncoder implements PasswordEncoder

[//]: ( extra things)
    to check or generate BCryptPasswordEncoder we can check in the website given below
        Bcrypt-Generator.com
    we can Encrypt or Decrypt in this website

 # CompromisedPasswordChecker method
    * not accepts anyinput
    * checks whether the password is compromised or not returns the non-null CompromisedPasswordDecistion 
    * @NonNull annotaion CompromisedPasswordDecision check(String password);
    * CompromisedPasswordChecker method which is introduced SpringSecurity 6.3 and it also ok to use in production Application
 
 # HaveIBeenPwnedRestApiPasswordChecker


 # internal flow of SpringSecurity 
        User entered credentials --1--> springSecurityfilters --2--> Authentication --3--> AuthenticationManager --4--> AuthenticationProviders --5--> UserDetailsManager/Service --6--> PasswordEncoded
        User entered credentials <--10-- SpringSecurityfilters <--9-- SecurityContext <--8-- AuthenticationManager <--7-- AuthenticationProviders <--6--------------------------------------------

 # USER MANAGEMENT 
    * UserDetailsSrvice(Interface) ----> UserDetailsManager(Interface) --> a. InMemoryUserDetailsManager, b. jdbcUserDetailsManager, c. LdapUserDetailsManager, also can build custom securityManager

 # UserDetails
    * All the above interfaces and classes uses an interface UserDetails & its implementation which privides core user information
    * Inside the UserDetailsManager/Service we use Use UserDetails interface and its implement class is User to represent 

 # UsernamePasswordAuthenticationToken 
    * most commonaly used class