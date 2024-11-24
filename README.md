# Pizza Bill Generator App

Welcome to the **Pizza Bill Generator App**! This app allows users to create a customized pizza order, apply extra charges for cheese, toppings, and takeaways, and finally generate an itemized bill.

## Features

- **Custom Pizza Selection**: Choose between vegetarian and non-vegetarian pizza types.
- **Add Extra Features**: Add extra cheese, extra toppings, and opt for takeaway to modify the price.
- **Bill Generation**: Automatically calculates the total price based on selected features and displays an itemized bill.

---

## Table of Contents

- [Concepts and Technologies Used](#concepts-and-technologies-used)
- [Classes and Features](#classes-and-features)


---

## Concepts and Technologies Used

This project demonstrates various important **Object-Oriented Programming (OOP)** concepts and **Java** fundamentals that are essential for creating structured and maintainable software. The key concepts used are:

### 1. **Object-Oriented Programming (OOP) Principles:**
   - **Encapsulation**: Each class contains the relevant data and methods that define the behavior of the objects. For example, the `Pizza` class encapsulates details about pizza type, price, and additional charges.
   - **Inheritance**: The `DeluxPizza` class inherits from the `Pizza` class, extending its functionality by adding extra cheese and toppings by default.
   - **Polymorphism**: The `addExtraCheese` and `addExtratopings` methods are overridden in the `DeluxPizza` class, demonstrating polymorphism where methods behave differently in the child class.
   - **Abstraction**: The `Pizza` class abstracts the details of price calculation and order customizations, offering a simple interface for the user to interact with.
   - **Constructors**: Both `Pizza` and `DeluxPizza` classes use constructors to initialize objects with required attributes like pizza type and price.

### 2. **Java Basics**:
   - **Data Members and Methods**: The project uses attributes (like `price`, `veg`, etc.) and methods (`addExtraCheese`, `addExtratopings`, `takeAway`, `getBill`) to perform actions and store values.
   - **Control Structures**: Used to check conditions like `if (this.veg)` to decide on the base price of the pizza and apply additional charges.
   - **String Manipulation**: The `getBill()` method constructs a detailed bill using string concatenation to display the breakdown of the charges.

### 3. **Additional Concepts**:
   - **Constructor Overloading**: Used in `DeluxPizza` to initialize the pizza object with additional default toppings and cheese.
   - **Method Overriding**: The `addExtraCheese` and `addExtratopings` methods are overridden in the `DeluxPizza` class, allowing for customized behavior.

---

## Classes and Features

### 1. **Pizza**
The `Pizza` class is the core of the app and handles the basic pizza customizations, such as size (vegetarian or non-vegetarian), adding extra cheese, toppings, and the option for takeaway.

- **Attributes**:
  - `price`: The current price of the pizza.
  - `veg`: Boolean indicating whether the pizza is vegetarian or not.
  - `extraCheeseprice`: Cost of adding extra cheese.
  - `extratopingspriceAdded`: Cost for adding extra toppings.
  - `BagCharges`: Cost of takeaway.
  - `basePizzaPrice`: The initial price of the pizza before any extras.
  - Flags for extra cheese, extra toppings, and takeaway options.

- **Methods**:
  - `addExtraCheese()`: Adds extra cheese to the pizza and adjusts the price.
  - `addExtratopings()`: Adds extra toppings to the pizza and adjusts the price.
  - `takeAway()`: Adds a takeaway charge to the pizza.
  - `getBill()`: Generates a detailed bill based on customizations.

### 2. **DeluxPizza**
The `DeluxPizza` class extends the `Pizza` class and customizes it by adding extra cheese and toppings by default.

- **Constructor**: Automatically adds extra cheese and toppings when a `DeluxPizza` is created.
- **Methods**: Overrides `addExtraCheese` and `addExtratopings` to maintain the default additions for deluxe pizzas.

### 3. **Launch**
The `Launch` class is where the app is run. It creates instances of `Pizza` and `DeluxPizza`, customizes them, and prints the final bill.

- **Main Method**: Demonstrates the app's functionality by creating pizza objects, adding extra features, and generating bills.

---



