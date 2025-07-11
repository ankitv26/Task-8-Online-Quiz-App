# Elevate Labs Internship Task 8 : Mini Project – Online Quiz App
## Task-8-Online-Quiz-App
## 📘 QuizApp – Java Console Quiz Application
### 📝 Description
QuizApp is a simple command-line quiz application developed in Java. It allows users to answer multiple-choice questions, evaluates their responses, and displays a final score. This project is ideal for beginners learning about Java OOP, user input handling, and basic list manipulation.

### 🚀 Features
    Text-based user interface
    Multiple-choice questions
    Real-time feedback on answers (correct/wrong)
    Final score summary
    Easy to extend (add more questions, difficulty levels, categories, etc.)

### 🛠 Technologies Used
    Java (JDK 8 or higher)
    Standard Java libraries (no external dependencies)

### 📂 Project Structure
```bash
    QuizApp/
    ├── QuizApp.java        # Main class – handles flow and user interaction
    ├── Questions.java      # Model class – represents each quiz question
    └── README.md           # Documentation
```
### 🔧 How to Run

    1. Clone the project or copy the source code into your local directory.
    2. Compile the code using the terminal:
```bash
    javac QuizApp.java Questions.java
```
    3.Run the application:
```bash
    java QuizApp
```
### ✅ Sample Output
```markdown
    ******* Welcome to QuizApp *******

    a. Who was the first Prime Minister of independent India?
    1. Mahatma Gandhi
    2. Jawaharlal Nehru
    3. Sardar Vallabhbhai Patel
    4. Dr. B.R. Ambedkar
    2
    ✅ Correct Answer!

    b. Which river is considered the holiest in India?
    1. Yamuna
    2. Brahmaputra
    3. Ganga
    4. Godavari
    1
    ❌ Wrong Answer.
    Correct Answer is: 3. Ganga

    Your final score is: 1/2
```
### 🧠 Code Explanation
    Questions.java
        A class to model each quiz question.
        Stores:
            questionText: The question itself.
            options[]: Array of possible answers.
            correctOption: The correct option number (1-based).
        displayQuestion(): Displays the question and its options.
        isCorrect(userAnswer): Checks and prints whether the user's answer is correct.

        QuizApp.java
            Main driver class.
            Initializes a list of questions.
            Uses a loop to:
                Display each question.
                Take user input.
                Evaluate and record the score.
            Displays the final result at the end.

### 🧩 Future Improvements (Suggestions)
    Read questions from a file (JSON/CSV).
    Track high scores or user profiles.
    Add categories or timed quizzes.
    GUI version using JavaFX or Swing.

