### 1. Age check
**Assignment:** Write a program that takes the user's age as input.
- [x] If the age is under 18, you should throw your own exception `UnderAgeException`.
- [x] The program should catch the exception and print a message: *"You are too young to register"*.
- [x] Otherwise, it will print *"Registration successful!"*.

---

### 2. Bank account
**Assignment:** Create a class `BankAccount` with a balance.
- [ ] Make a method `withdraw(int amount)`.
- [ ] If you try to withdraw more than the balance, throw your own exception `InsufficientFundsException`.
- [ ] Try first depositing money, then withdrawing more than what is in the account.

---

### 3. Password check
**Assignment:** Write a method that accepts a password as a parameter.
- [ ] If the password is shorter than 8 characters, throw `PasswordTooShortException`.
- [ ] If the password does not contain at least one digit, throw `PasswordMissingNumberException`.
- [ ] If the password is accepted, write *"Password accepted"*.

---

### 4. Temperature check
**Assignment:** Create a method that accepts a temperature in Celsius.
- [ ] If the temperature is below -273, throw `BelowAbsoluteZeroException`.
- [ ] If the temperature is above 1000, throw `TooHotException`.
- [ ] Otherwise, write *"The temperature is valid: X°C"*.

---
