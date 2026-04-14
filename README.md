# BankingApp

A simple, interactive command-line banking application built in Java. BankingApp simulates basic ATM-style operations, allowing users to manage a bank account through a text-based menu interface.

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Technology Stack](#technology-stack)
- [Contributing](#contributing)
- [License](#license)

---

## Project Overview

BankingApp is a Java console application that demonstrates core object-oriented programming principles in the context of a real-world banking scenario. The application presents users with an ATM-style menu to perform common banking operations on a single account. It is designed as an educational project to showcase encapsulation, input validation, and interactive CLI design in Java.

---

## Features

- 💰 **Deposit** — Add funds to your account with automatic validation to reject zero or negative amounts.
- 🏧 **Withdraw** — Withdraw funds with overdraft protection; the application prevents withdrawals that exceed the current balance.
- 📊 **Check Balance** — View the current balance and account holder name at any time.
- 🚪 **Exit** — Safely close the session (equivalent to ejecting your card from an ATM).
- 🛡️ **Input Validation** — Handles non-numeric input gracefully using exception handling, keeping the application running without crashing.

---

## Prerequisites

Before running BankingApp, ensure you have the following installed:

- **Java Development Kit (JDK) 11 or higher**
  - [Download JDK](https://adoptium.net/) (Eclipse Temurin recommended)
  - Verify installation: `java -version`
- **Git** (optional, for cloning the repository)
  - [Download Git](https://git-scm.com/)

> **Optional:** [Visual Studio Code](https://code.visualstudio.com/) with the [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) for an enhanced development experience.

---

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Pluggamaro/BankingApp.git
cd BankingApp
```

### 2. Compile the Source Code

From the root of the project, compile both Java source files:

```bash
javac -d bin src/App.java src/BankAccount.java
```

### 3. Run the Application

```bash
java -cp bin App
```

The application will start and display the main banking menu.

---

## Project Structure

```
BankingApp/
├── src/
│   ├── App.java          # Entry point — handles the menu loop and user interaction
│   └── BankAccount.java  # BankAccount class — encapsulates account data and operations
├── bin/
│   ├── App.class         # Compiled bytecode for App
│   └── BankAccount.class # Compiled bytecode for BankAccount
├── lib/                  # External dependencies (currently unused)
├── .vscode/
│   └── settings.json     # VS Code Java project settings
└── README.md
```

| Folder/File | Description |
|---|---|
| `src/` | Java source files |
| `bin/` | Compiled `.class` files (generated on build) |
| `lib/` | External dependencies (currently unused) |
| `.vscode/` | Editor settings for VS Code Java tooling |

---

## Usage

Once the application is running, you will see the following menu:

```
========SIMPLE BANKING APP========
         1. Withdraw
         2. Deposit
         3. Check Balance
         4. Give Back Card (EXIT)
----------------------------------
Make choice by number:
```

### Example Session

```
Make choice by number: 3
===BALANCE===
Account Holder: Bongani Zuma
Current Balance: R14000.00

Make choice by number: 2
Enter amount to deposit: 500
Successfully deposited R500.00.

Make choice by number: 1
Enter amount to withdraw: 20000
Error: Insufficient Funds. Your balance is R14500.00

Make choice by number: 4
Ejecting Card...Thank you!
```

### Input Rules

- Enter only the **number** corresponding to your menu choice.
- Deposit and withdrawal **amounts must be whole (integer) numbers** — the current implementation uses `Scanner.nextInt()`, so decimal values are not accepted.
- Entering a non-numeric value will display an error and re-prompt the menu.

---

## Technology Stack

| Technology | Details |
|---|---|
| **Language** | Java (JDK 11+) |
| **I/O** | `java.util.Scanner` for console input |
| **Error Handling** | `java.util.InputMismatchException` for invalid input |
| **Build** | `javac` (standard Java compiler) |
| **IDE Support** | Visual Studio Code with Java Extension Pack |

---

## Contributing

Contributions are welcome! To contribute:

1. **Fork** the repository on GitHub.
2. **Create a branch** for your feature or bug fix:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Commit** your changes with a clear message:
   ```bash
   git commit -m "Add: description of your change"
   ```
4. **Push** your branch and open a **Pull Request**:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Describe your changes in the Pull Request and reference any related issues.

### Ideas for Contribution

- Add support for multiple accounts
- Implement transaction history / statement printing
- Add a PIN/authentication system
- Persist account data using file I/O or a database
- Write unit tests using JUnit

---

## License

This project is open source and available under the [MIT License](LICENSE).
