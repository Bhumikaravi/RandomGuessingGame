<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=450A0A,DC2626,F87171&height=220&section=header&text=Random%20Number%20Guessing%20Game%20%28Java%29&fontSize=38&fontColor=ffffff&fontAlignY=38&desc=Modular%20State%20Execution%2C%20Console%20Game%20Loop%2C%20and%20Input%20Parsing&descSize=16&descAlignY=62&descAlign=50" width="100%" alt="Random Number Guessing Game (Java) Header Banner"/>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/> <img src="https://img.shields.io/badge/Architecture-Modular%20State-blue?style=for-the-badge" alt="Modular"/>
</p>


## 📌 Table of Contents
- [📖 Executive Summary](#-executive-summary)
- [✨ Key Features & Capabilities](#-key-features--capabilities)
- [🏗️ System Architecture & Workflow](#️-system-architecture--workflow)
- [🛠️ Tech Stack Breakdown](#️-tech-stack-breakdown)
- [⚙️ Reproducible Quickstart & Setup](#️-reproducible-quickstart--setup)
- [📂 Project Directory Layout](#-project-directory-layout)
- [👩‍💻 Author & Contributions](#-author--contributions)

---

## 📖 Executive Summary
### Problem Statement
Console game applications frequently suffer from monolithic code structures where input parsing, state checks, and loop flow are tangled in a single file.

### Motivation & Solution Overview
A modular Java console game that separates distinct responsibilities into dedicated classes: input parsing (`Input.java`), boundary validation (`Check.java`), game initialization (`Start.java`), visual scrolling (`Scroll.java`), and exit lifecycle (`Exit.java`).

---

## ✨ Key Features & Capabilities
- **Separation of Concerns:** Distinct classes for user input, validation, and game loop orchestration.
- **Dynamic Difficulty:** Bounds checking and attempt tracking with user guidance.
- **Robust Exception Handling:** Safe handling of non-numeric console inputs.

---

## 🏗️ System Architecture & Workflow
```mermaid
flowchart TD
    Main[Main.java Controller] --> Start[Start.java: Random Generation]
    Main --> Input[Input.java: Console Reader]
    Input --> Check[Check.java: Bound & Match Evaluator]
    Check --> Scroll[Scroll.java: Visual Formatting]
    Check --> Exit[Exit.java: Win/Loss Lifecycle]
```

---

## 🛠️ Tech Stack Breakdown
| Category | Technologies |
|---|---|
| **Language** | Java (JDK 8+) |
| **Design** | Modular Class Architecture, Java Scanner API |

---

## ⚙️ Reproducible Quickstart & Setup
```bash
git clone https://github.com/Bhumikaravi/RandomGuessingGame.git
cd RandomGuessingGame
javac *.java
java Main
```

---

## 📂 Project Directory Layout
```text
RandomGuessingGame/
├── Check.java
├── Exit.java
├── Input.java
├── Main.java
├── Scroll.java
├── Start.java
└── README.md
```

---

## 👩‍💻 Author & Contributions
Developed by **Bhumika Ravi** ([@Bhumikaravi](https://github.com/Bhumikaravi)), Bachelor of Computer Applications (BCA) at **Alliance University, Bengaluru**.

- 💻 **GitHub Profile:** [github.com/Bhumikaravi](https://github.com/Bhumikaravi)
- 🔗 **LinkedIn:** [linkedin.com/in/bhumika-ravi-b5a01b326](https://www.linkedin.com/in/bhumika-ravi-b5a01b326/)
- 📬 **Email Contact:** [bhumikaravi2006@gmail.com](mailto:bhumikaravi2006@gmail.com)

---

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=450A0A,DC2626,F87171&height=100&section=footer" width="100%" alt="Footer Banner"/>
</p>
