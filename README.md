# Simple Banking App

This is a simple command-line Java application that simulates a basic banking system.

## 💼 Features

- Create a bank account with an owner's name
- Deposit funds
- Withdraw funds with validation (no overdrafts)
- View current account balance

## 🧪 Testing

This project includes unit tests using **JUnit 5**. Test cases include:

- Valid deposit increases balance
- Valid withdrawal decreases balance
- Invalid withdrawal (overdraft) throws an exception

To run the tests:
```bash
mvn test
```

## ⚙️ Technologies Used

- Java 17
- Maven
- JUnit 5
- GitHub Actions (CI)

## 🔁 Branching Strategy

This project follows a **Dev/Trunk-based workflow**:
- All development was done in the `dev` branch
- Pull requests were used to merge into `main`
- GitHub Actions run tests on every PR

## ✅ GitHub Actions

A CI workflow is configured to:
- Run `mvn clean install` on every pull request to `main`
- Automatically check if the unit tests pass

You can find the configuration in `.github/workflows/ci.yml`.

## 📂 Project Structure

```
simple-banking-app/
├── src/
│   ├── main/java/com/chris/bank/
│   │   ├── Account.java
│   │   └── BankApp.java
│   └── test/java/com/chris/bank/
│       └── AccountTest.java
├── pom.xml
└── .github/workflows/ci.yml
```

## 📌 Author

**Christian Rose**  