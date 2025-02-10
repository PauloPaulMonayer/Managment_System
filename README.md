# Clothing Store Chain Management System

## Project Description

This project is a management system for a clothing store chain, providing interfaces for inventory, customers, employees, reports, and communication between branches. The system is based on a client-server architecture and follows Object-Oriented Programming (OOP) principles.

## Key Features

### 1. Inventory Management
- Separate inventory management for each branch
- Inventory updates after every transaction
- Ability to process purchases and sales

### 2. Customer Management
- Centralized customer list shared across all branches
- Customer details: Full name, ID, phone number, customer type (new, returning, VIP)
- Unique purchasing path for each customer type

### 3. Employee Management
- Manage employee data (name, ID, phone, employee number, branch assignment, role, etc.)

### 4. Sales Reports
- Sales reports per branch
- Reports by product/category
- Reports generated in JSON and Word format

### 5. Inter-branch Chat System
- Open chat between employees from different branches
- Automatic queue-based employee search and chat initiation
- Shift managers can join ongoing conversations
- Prevents multiple logins of the same user from different devices

### 6. Logging System
- Logs actions such as employee/customer registration, purchases/sales, and chat interactions

## Technologies

- **Programming Language:** Java
- **Database:** (Team's choice - MySQL / PostgreSQL / MongoDB)
- **Architecture:** Client-Server
- **Data Format:** JSON

## Installation & Execution

1. Install required dependencies (list external libraries if applicable)
2. Run the backend server
3. Start the user interface (if a GUI is implemented)
4. Connect users and test functionality

## Testing

- **Unit Tests** for core system components
- **Integration Tests** to ensure seamless interaction between modules
- **Performance Tests** if necessary

## Contributors

- This project was developed as part of the Algorithmic Development in Java course at HIT
- Instructor: Mr. Roy Zimon

## Additional Notes

- Ensure the system is implemented with clean, well-documented code adhering to OOP principles
- Implement Design Patterns for queue-based chat management
- Further learning and expansions as per project requirements

