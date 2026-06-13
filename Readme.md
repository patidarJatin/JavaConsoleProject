# Project No.1 Console Based Java Project
# 🎯 Guess The Number Game (Java)

A simple console-based Number Guessing Game built using Java. The computer generates a random number between 1 and 100, and the player has 7 chances to guess it correctly.

---

## 🚀 Features

* Random number generation
* User input handling
* Hint system (Higher / Lower)
* Limited attempts
* Win/Lose detection
* Beginner-friendly Java project

---

## 🛠️ Technologies Used

* Java
* Scanner Class
* Loops
* Conditional Statements
* Math.random()

---

## 🎮 How the Game Works

1. The computer generates a random number between 1 and 100.
2. The player gets 7 attempts to guess the number.
3. After each incorrect guess, a hint is displayed:

    * Number is greater than your guess.
    * Number is less than your guess.
4. If the player guesses correctly, they win.
5. If all attempts are exhausted, the correct number is revealed.


## 📂 Project Structure

```text
GuessNumberGame/
│
├── GuessNumber.java
└── README.md
```

---

## 💡 Sample Output

```text
Rule of the Game:
You have 7 chances to guess a number.
The number is between 1 and 100.

Enter a Guess Number: 50

Number is greater than 50

Enter a Guess Number: 75

Number is less than 75

Enter a Guess Number: 68

Congratulations! You guessed the number.
```

---

## 🧠 Concepts Practiced

* Java Fundamentals
* User Input Handling
* Random Number Generation
* Loops
* Conditional Logic
* Problem Solving
* Console Applications

<br>



<br>

# Project No.2 Console Based Java Project
# ❌⭕ Tic Tac Toe Game (Java)

A console-based Tic Tac Toe game built using Java. Two players take turns placing their marks (X and O) on a 3×3 board. The game detects wins, draws, and invalid moves while providing an interactive command-line experience.

---

## 🚀 Features

* Two-player gameplay
* Dynamic 3×3 board
* Win detection
* Draw detection
* Input validation
* Exception handling
* Turn switching (X and O)
* Console-based user interface

---

## 🛠️ Technologies Used

* Java
* Arrays
* Methods
* Loops
* Conditional Statements
* Exception Handling
* Scanner Class

---

## 🎮 Game Rules

1. Player X starts first.
2. Players take turns entering a slot number (1–9).
3. A player cannot place a mark in an occupied slot.
4. The first player to align 3 marks horizontally, vertically, or diagonally wins.
5. If all slots are filled and no player wins, the game ends in a draw.

---

## 📋 Board Layout

```text
1 | 2 | 3
---------
4 | 5 | 6
---------
7 | 8 | 9
```

Players enter the corresponding slot number to place their mark.


## 📂 Project Structure

```text
TicTacToeGame/
│
├── TicTacToeGame.java
└── README.md
```

---

## 💡 Sample Gameplay

```text
Welcome to 3*3 Tic Tac Toe Game

|---|---|---|
| 1 | 2 | 3 |
|---|---|---|
| 4 | 5 | 6 |
|---|---|---|
| 7 | 8 | 9 |
|---|---|---|

Player X will Play First

Enter slot number: 5

|---|---|---|
| 1 | 2 | 3 |
|---|---|---|
| 4 | X | 6 |
|---|---|---|
| 7 | 8 | 9 |
|---|---|---|
```

---

## 🧠 Concepts Practiced

* Arrays
* Method Creation
* Input Validation
* Exception Handling
* Game Development Logic
* Turn-Based Programming
* Problem Solving
* Console Application Design

---
<br>



<br>

# Project No.3 Console Based Java Project
# 🎮 Rock Paper Scissors Game (Java)

A simple console-based Rock Paper Scissors game developed in Java. The player competes against the computer for 5 rounds, and the final winner is determined based on the score.

---

## 📌 Features

* Console-based gameplay
* User vs Computer
* Random computer choices
* Input validation
* Score tracking
* Winner announcement after 5 rounds
* Clean and modular code using methods

---

## 🛠️ Technologies Used

* Java
* Loops
* Conditional Statements
* Methods
* Math.random()

---

## 🎯 Game Rules

| Choice  | Number |
| ------- | ------ |
| Rock    | 1      |
| Paper   | 2      |
| Scissor | 3      |

### Winning Conditions

* Rock beats Scissor
* Scissor beats Paper
* Paper beats Rock
* Same choices result in a Draw

## 📷 Sample Output

```text
Welcome to Rock-Paper-Scissor Game

Your 1's chance:
Enter your Choice Number: 1

Your choice is: Rock

Computer choice is: Scissor

You Win This Round

Score -> You : 1 Computer : 0
```

---

## 📂 Project Structure

```text
RockPaperScissor/
│
├── RockPaperScissor.java
└── README.md
```

---

## 🧠 Concepts Practiced

This project helped me practice:

* Java Fundamentals
* Method Creation
* Code Refactoring
* Input Validation
* Random Number Generation
* Problem Solving
* Clean Code Practices
