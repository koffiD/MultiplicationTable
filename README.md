🔢 Multiplication Table Generator






A simple Java console application that displays the multiplication table of a number entered by the user.
This project is great for beginners learning loops, user input, and basic Java syntax.

🧠 How It Works

The program prompts the user to enter a number between 1 and 10.

It then uses a for loop to calculate and display the multiplication table for that number up to 10.

The result is printed in a clean, formatted style.

💻 Example Run
Enter a number from 1 to 10 for multiplication
5
Multiplication table for 5 :
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
5 X 8 = 40
5 X 9 = 45
5 X 10 = 50

🧩 Code Overview
for (int i = 1; i <= 10; i = i + 1) {
    int result = number * i;
    System.out.println(number + " X " + i + " = " + result);
}


The loop runs from 1 to 10.

On each iteration, it multiplies the user's input by the loop variable i.

It then prints each line in the standard multiplication format.

🚀 How to Run

Save the file as MultiplicationTable.java

Open your terminal or IDE (VS Code, IntelliJ, or Eclipse)

Compile and run the program:

javac MultiplicationTable.java
java MultiplicationTable

🧾 Requirements

☕ Java JDK 8 or higher

🖥️ Any IDE or terminal that supports Java execution
