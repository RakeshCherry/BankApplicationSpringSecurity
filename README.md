# BankApplicationSpringSecurity
Using SpringSecurity6 creating Bank Application where user and admin can access there account and all features of spring security are used in this. this project is to learn and understand the concepts of spring security 6 features


## Section 4 
  * In this created mysql container using DOCKER
  * added script.sql which will be using in client of sqlecron to create backapplication database tables username and password
  * created new custom UserDetailsService class as 'BankBackendUserDetailsService'
  * created REST API UserController so register role base new user without having any security restriction
  
## section 5
 * In this learnt different types of password storing inside the DB using backend springSecurity
 * Encoding, Encryption, and Hashing of the password
 * Encoding is not secured and also not recommonded for production base application
 * Encryption can use but it can be hacked by BruseForce Attack or Rainbow Table or Distonary Table by Hackers
 * Hashing is best way to avoid hackers to hack the password in salt password + hash value can store password in secured way
 * also learnt the Salts value of the password
 * to secure the password the best way is to store data inside the DB using Bcrypt Hashing password
