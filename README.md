# 🩺 Health Monitoring System

This is a Java Spring Boot-based web application that predicts **Glucose**, **Cholesterol**, and **Hemoglobin** levels from user inputs: **Sodium**, **Potassium**, and **Lactose**. It presents results with color-coded feedback for quick health interpretation.

---

## 🌟 Features

- ✅ Input form for Sodium, Potassium, and Lactose
- 🧠 Calculates:
  - Glucose = `(sodium * 0.5 + potassium * 0.3 + lactose * 0.2)`
  - Cholesterol = `(sodium * 0.2 + potassium * 0.5 + lactose * 0.3)`
  - Hemoglobin = `(sodium * 0.3 + potassium * 0.2 + lactose * 0.5)`
- 🎨 Result Page with:
  - 🟢 **Normal**
  - 🔵 **Medium**
  - 🔴 **High**
- 📐 Gradient background with centered box layout
- ⚙️ Built using Spring Boot, JSP, CSS

---

## 🧩 Tech Stack

- **Frontend:** HTML5, CSS  
- **Backend:** Java, Spring Boot  
- **Build Tool:** Maven  
- **Database:** MySQL  
- **Database Connector:** JDBC   
- **IDE:** IntelliJ IDEA / Eclipse    
- **Other Tools:** MySQL Workbench

## 🛠️Build and Run
-- mvn clean install
-- mvn spring-boot:run

## Access the App
-- Go to: http://localhost:8080



