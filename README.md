<h1 align="center">Magical Arena</h1>

This project simulates a turn-based combat arena where two players, defined by their attributes, engage in battle until one player's health reaches zero. The player with lower health attacks first, and the combat proceeds in turns.

## 
### Project Structure
 

MagicalArena <br>
├── src  <br>
│ ├── Player.java  <br>
│ ├── Match.java  <br>
│ ├── MagicalArena.java   <br>
├── test   <br>
│ ├── MatchTest.java  <br>
├── .vscode  <br>
│ ├── launch.json  <br>
│ ├── settings.json <br>
└── README.md  <br>


## Classes

### Player

The `Player` class represents a player with attributes for health, strength, and attack. It contains methods to attack, defend, and reduce health.

### Match

The `Match` class handles the combat logic between two players. It determines the attack and defense rolls, calculates damage, and updates the health of the players accordingly.

### MagicalArena

The `MagicalArena` class contains the main method to set up the match and print the results.

### MatchTest

The `MatchTest` class contains unit tests to ensure the correctness of the implementation using JUnit.

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK) 11 or later
- Visual Studio Code with Java Extension Pack

### Setup

1. **Clone the repository:**
    ```sh
    git clone https://github.com/your-repository/magical-arena.git
    cd magical-arena
    ```

2. **Open the project in VS Code:**
    ```sh
    code .
    ```

3. **Install Java Extension Pack in VS Code:**
    - Go to the Extensions view (`Ctrl+Shift+X`).
    - Search for "Java Extension Pack" and install it.

### Build and Run


 **Run the project:**
    - Use the Debug view to start debugging.
    - Alternatively, you can run the compiled classes directly:
        ```sh
        java -cp bin MagicalArena
        ```

### Run Unit Tests

1. **Compile test classes:**
    ```sh
    javac -cp .;path/to/junit-5.7.0.jar -d bin test/MatchTest.java
    ```

2. **Run tests:**
    - Use the Java Test Runner extension in VS Code.
    - Or run tests from the terminal:
        ```sh
        java -cp .;path/to/junit-5.7.0.jar org.junit.jupiter.api.Test
        ```


## Contact

For any inquiries or issues, please contact Rajat Nagar at rajatnagar7893@gmail.com
