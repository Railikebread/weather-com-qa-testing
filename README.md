# 🌦️ Weather.com QA Automation Framework

This is a real-world test automation framework built in Java using Selenium WebDriver and TestNG.  
It validates the search and navigation features on [weather.com](https://www.weather.com), with a clean, modular Page Object Model design.

---

## 📦 Tech Stack

- **Java 17**
- **Selenium WebDriver 4**
- **TestNG**
- **Maven**
- **WebDriverManager**
- **Page Object Model (POM) Design**
- IDE: **Eclipse**
- Version Control: **Git + GitHub**

---

## 📂 Project Structure

```text
src
└── test
    └── java
        └── com.qa.base      # BaseTest class (setup + teardown)
        └── com.qa.pages     # Page Object classes (WeatherHomePage, HamburgerMenuPage, etc.)
        └── com.qa.tests     # Test classes (searchWeatherByCityTest, etc.)
        └── utils            # ElementUtil helper class (smart waits, reusable actions)



---

## ✅ Key Features

- Automated validation of city weather search via input and dropdown
- Stable locators using XPath and dynamic waits
- Smart interaction layer with `ElementUtil` helper class
- Extendable framework for future test cases (navigation, privacy links, etc.)
- Git integration with clean commits and repo history

---

🔮 Future Improvements
Add testng.xml to support suite configuration

Integrate ExtentReports for HTML test reporting

Expand POM coverage (hamburger menu links, forecast sections, etc.)

Add CI pipeline with GitHub Actions

👨‍💻 Author
Rai

GitHub: @Railikebread

Built for learning, portfolio growth, and to transition into a full-time Software QA or SDET role.

---
