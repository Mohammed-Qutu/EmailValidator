# EmailValidator

## Description
This Java program checks whether an email address is valid by applying certain validation criteria. It ensures the email has a length between 15 and 25 characters, contains an "@" symbol, and includes at least one number. This project demonstrates basic string manipulation, loops, and conditionals in Java.

## Author
Written by Mohammed Qutu on 4/6/2024.

## Requirements
- Java 21.0.2 or later

## Usage
To run the program, compile the `EmailValidatorApp.java` file and execute it. The user will be prompted to enter an email address, and the program will determine whether the email is valid based on the specified conditions.

### Example Output
Enter your email address: example123@example.com Valid

### Validation Criteria:
- The email address must be between 15 and 25 characters long.
- The email address must contain an "@" symbol.
- The email address must include at least one numerical digit.

### Methods:
- `isValidEmail(String email)`: Returns `true` if the email meets all the validation criteria, otherwise returns `false`.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
