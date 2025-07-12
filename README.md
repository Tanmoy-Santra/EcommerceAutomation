# 🛒 EcommerceAutomation

This is a Selenium WebDriver automation project built with **TestNG**, **Java**, and **Maven** for automated testing of the [SauceDemo Ecommerce site](https://www.saucedemo.com).

---

## 🚀 Features

- ✅ Login functionality testing
- ✅ Product filter validation (Low to High, High to Low)
- 🔄 Cross-browser support (Chrome & Firefox)
- 🔧 Scalable with Page Object Model (POM) design
- 🧪 TestNG framework for test execution and management

---

## 📁 Project Structure

```
EcommerceAutomation/
├── pom.xml
├── testng.xml
├── src/
│   ├── main/java/utils/DriverFactory.java
│   └── test/java/
│       ├── base/BaseTest.java
│       ├── pages/LoginPage.java
│       ├── pages/ProductsPage.java
│       └── tests/LoginTest.java
│       └── tests/ProductFilterTest.java
```

---

## 🛠️ Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager
- Eclipse/IntelliJ (IDE)

---

## 🔧 Setup & Run Instructions

### 1. Clone the repository

```bash
git clone https://github.com/your-username/EcommerceAutomation.git
cd EcommerceAutomation
```

### 2. Import into Eclipse or IntelliJ as Maven Project

### 3. To run tests using TestNG

```bash
mvn clean test
```

> Or right-click on `testng.xml` in Eclipse → Run As → TestNG Suite

---

## 📦 Author

**Tanmoy Santra**  
Computer Science Engineer | Automation & Full Stack Developer

---

## 📜 License

This project is open-source and free to use under the MIT License.
