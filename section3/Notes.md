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
 
 # HaveIBeenPwnedRestApiPasswordChecker
