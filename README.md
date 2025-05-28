# Simple Banking App

This is a simple command-line Java application that simulates a basic banking system.


---

##  Documentation

### 🔹 1. Clean Code Practices (With Example References)

The project follows clean code principles throughout. Here are three examples:

- **Descriptive Method Names**  
  Methods like `deposit()`, `withdraw()`, and `getBalance()` clearly indicate what they do.
  ```java
  public void deposit(double amount) { ... }
  ```

- **Encapsulation and Private Fields**  
  The `Account` class uses private fields and exposes controlled access through public methods.
  ```java
  private double balance;
  public double getBalance() { return balance; }
  ```

- **Meaningful Test Names in JUnit**  
  Test methods are clearly named to describe the scenario and expected outcome.
  ```java
  @Test
  void withdrawTooMuchShouldThrowException() { ... }
  ```

The required screenshots of these clean code examples are attached in the documentation folder in the repository.

---

### 🔹 2. Project Overview

This project is a **Simple Banking Application** built using Java. It allows the user to:
- Create a bank account
- Deposit funds
- Withdraw funds (with validation to prevent overdrafts)
- Check current balance

All interactions are handled programmatically (no scanner input required per spec).

---

### 🔹 3. Unit Tests

There are **3 unit tests** written using **JUnit 5**, found in `AccountTest.java`. They validate:

- **Positive Case:** Depositing correctly increases the balance.
- **Positive Case:** Withdrawing valid amount correctly decreases the balance.
- **Negative Case:** Attempting to withdraw more than the balance throws an exception.

These tests were run with:
```bash
mvn test
```

---

### 🔹 4. Dependencies

This project uses Maven for dependency management. The main dependencies in `pom.xml` are:

```xml
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter</artifactId>
  <version>5.9.3</version>
  <scope>test</scope>
</dependency>
```

All dependencies were pulled from **Maven Central Repository**.

---

### 🔹 5. Issues Encountered

-  **Initial Maven setup** failed due to using the wrong directory — resolved by running from the correct folder.
-  **CI failed** on GitHub Actions due to environment config.
-  Minor confusion with `AppTest.java` → replaced it with `AccountTest.java` for relevance.
-  GitHub Actions were successfully configured and triggered via Pull Requests.
-  `.gitignore` added to clean out unnecessary build files like `target/`.

---

###  Final Notes

This project uses:
- Clean, testable code
- A structured dev → main GitHub workflow (3 PRs created and merged)
- Auto-run tests via GitHub Actions
- JUnit 5 for full test coverage of core banking logic

---

##  Author

**Christian Rose**  
