### 1. Age check
**Assignment:** Write a program that takes the user's age as input.
- [x] If the age is under 18, you should throw your own exception `UnderAgeException`.
- [x] The program should catch the exception and print a message: *"You are too young to register"*.
- [x] Otherwise, it will print *"Registration successful!"*.

---

### 2. Bank account
**Assignment:** Create a class `BankAccount` with a balance.
- [x] Make a method `withdraw(int amount)`.
- [x] If you try to withdraw more than the balance, throw your own exception `InsufficientFundsException`.
- [x] Try first depositing money, then withdrawing more than what is in the account.

---

### 3. Password check
**Assignment:** Write a method that accepts a password as a parameter.
- [x] If the password is shorter than 8 characters, throw `PasswordTooShortException`.
- [x] If the password does not contain at least one digit, throw `PasswordMissingNumberException`.
- [x] If the password is accepted, write *"Password accepted"*.

---

### 4. Temperature check
**Assignment:** Create a method that accepts a temperature in Celsius.
- [x] If the temperature is below -273, throw `BelowAbsoluteZeroException`.
- [x] If the temperature is above 1000, throw `TooHotException`.
- [x] Otherwise, write *"The temperature is valid: X°C"*.

---

### 5. Storage facility
**Assignment:** Create a class `Product` with name and quantity in stock.
- [x] Make a method `sell(int amount)`.
- [x] If you try to sell more products than are in stock, throw `OutOfStockException`.
- [x] If you try to sell `0` or a negative quantity, throw `InvalidAmountException`.
- [x] Otherwise, reduce the stock and print a new quantity.

---

### 6. Division
**Assignment:** Write a method that divides two numbers.
- [x] If the denominator is `0`, throw `DivisionByZeroException`.
- [x] The program should catch the exception and print *"You cannot divide by zero"*.
- [x] Otherwise, print the result.

---

### 7. Car speed
**Assignment:** Create a class `Car` with a method `setSpeed(int speed)`.
- [ ] If the speed is below `0`, throw NegativeSpeedException.
- [ ] If the speed is above `300`, throw `SpeedLimitExceededException`.
- [ ] Otherwise, write *"Speed set to X km/h"*.

---

### 8. Telephone number
**Assignment:** Write a method `validatePhoneNumber(String number)`.
- [ ] If the number is not exactly 10 digits long, throw `InvalidPhoneNumberException`.
- [ ] If the number contains characters other than digits, throw `NotNumericException`.
- [ ] If the number is valid, write *"Phone number accepted"*.

---

### 9. E-mail address
**Assignment:** Write a method `checkEmail(String email)`.
- [ ] If the email address does not contain `@`, throw `MissingAtSymbolException`.
- [ ] If the email address does not end in `.com` or `.se`, throw `InvalidDomainException`.
- [ ] Otherwise, write *"Email address approved"*.

---

### 10. Cooking
**Assignment:** Create a class `Oven` with a method `bake(int minutes, int temperature)`.
- [ ] If minutes is `0` or negative, throw `InvalidTimeException`.
- [ ] If temperature is below `50`, `throw TooColdException`.
- [ ] If temperature is above `300`, `throw TooHotException`.
- [ ] Otherwise, write *"The food is ready in X minutes at Y°C"*.

---
