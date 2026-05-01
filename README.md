# 🏦 Bank Account Management System

### 🚀 Java OOP Project | Clean Architecture | GitHub Ready

<p align="center">
  💳 Deposit • Withdraw • Transfer • Mini Statement  
</p>

---

## 🌟 Project Overview

A **Bank Account Management System** built using **Java & Object-Oriented Programming** principles.
This project simulates real-world banking operations with proper structure, validation, and transaction handling.

---

## ✨ Key Features

✔️ Account Creation & Management
✔️ Secure PIN Authentication
✔️ Deposit & Withdraw Money
✔️ Fund Transfer (Internal/External)
✔️ Mini Statement Generation
✔️ Transaction History Tracking
✔️ Error Handling & Validation

---

## 🧠 System Workflow

### 🔐 Authentication

* User logs in using **PIN**
* System verifies credentials

### 💸 Transactions

* Choose: Deposit / Withdraw / Transfer
* System checks balance
* Updates account instantly

### 🧾 Records

* Every transaction is stored
* Timestamp-based tracking

---

## 🔄 Flow Handling

### ✅ Main Flow

```text
Authenticate → Select Operation → Validate → Process → Update Balance → Save Transaction
```

### ⚠️ Alternate Flow

* ❌ Insufficient Balance → Show error / overdraft
* 🔁 External Transfer → Routed via NEFT/IMPS
* 💰 Large Withdrawal → Requires approval

### 🚨 Exception Flow

* 🔒 Wrong PIN (3 times) → Account Locked
* ⏳ Timeout → Transaction Rollback
* ❗ Invalid Account → Error Message

---

## 🏗️ System Design (OOP)

### 🧾 Account Class

```java
accountNumber, holderName, balance, accountType, status, pin
deposit(), withdraw(), getBalance(), freeze()
```

### 💳 Transaction Class

```java
txnId, fromAccount, toAccount, amount, type, timestamp, status
execute(), rollback(), getReceipt()
```

### 👤 Customer Class

```java
customerId, name, phone, accounts[]
authenticate(), viewStatement(), addBeneficiary()
```

### 🏦 Bank Class

```java
bankCode, name, branches[]
createAccount(), closeAccount(), calculateInterest()
```

### 📄 MiniStatement Class

```java
accountNumber, transactions[]
generate(), filterByDate(), exportToPDF()
```

---

## 🔒 Non-Functional Requirements

⚡ Fast Response Time (< 3 seconds)
🔐 Secure Transactions (ACID principles)
👥 Supports multiple users

---

## 🛠️ Tech Stack

| Technology    | Usage             |
| ------------- | ----------------- |
| Java          | Core logic        |
| OOP           | Design principles |
| IntelliJ IDEA | Development       |
| Git & GitHub  | Version control   |

---

## 🚀 Getting Started

```bash
git clone https://github.com/your-username/your-repo-name.git
```

1. Open in IntelliJ IDEA
2. Run `Main.java`
3. Start using the system

---

## 📸 (Optional) Screenshots

*Add your project screenshots here*

---

## 🔮 Future Enhancements

✨ GUI using JavaFX / Flutter
✨ Database Integration (MySQL)
✨ Online Banking APIs
✨ Mobile App Version

---

## 👨‍💻 Author

**Dayanithi V**
📌 Aspiring Software Developer

---

## ⭐ Support

If you like this project:
👉 Star ⭐ the repo
👉 Fork 🍴 it
👉 Share 🔥

---
