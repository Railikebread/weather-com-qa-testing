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

## 🧪 Test Scenarios Implemented

| Test Name                      | Description |
|-------------------------------|-------------|
| `searchWeatherByCityTest()`   | Verifies user can search for a city and validate the resulting location header |
| `verifyPrivacySettingsLink()` | *Coming Soon* - Will validate navigating to Privacy Settings via hamburger menu |

---

## 🚀 How to Run Tests

1. Clone this repo  
2. Open in Eclipse (or your preferred IDE)  
3. Ensure Maven is installed  
4. Run tests via:
```bash
mvn clean test
Or right-click any test class in Eclipse and choose Run As → TestNG Test

🔮 Future Improvements
Add testng.xml to support suite configuration

Integrate ExtentReports for HTML test reporting

Expand POM coverage (hamburger menu links, forecast sections, etc.)

Add CI pipeline with GitHub Actions

👨‍💻 Author
Rai

GitHub: @Railikebread

Built for learning, portfolio growth, and to transition into a full-time Software QA or SDET role.

yaml
Copy
Edit

---

### 🛠 How to Add This in Eclipse

1. Right-click your project → `New > File`
2. Name it: `README.md`
3. Paste the contents above
4. Save, then:
   ```bash
   git add README.md
   git commit -m "Added project README"
   git push origin main
