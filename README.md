# inventory-management-system

This is an inventory management system that utilizes rest API and SpringBoot to interact and manage the relationships and transactions between different resources in the system.

  

## ER Diagram design

![Alt text](ER_Diagram.png "ER Diagram")

### Resources Description

1. Item: Describes the relations and attributes a product in the system has.<br>

    Attributes:<br>

    - Item ID: PK, Identifies Items Uniquly

    - Item Name: Describes Items

    - Item Price: Gives Value TO Items

    - Item Avalibility: Evaluates If The Item Can Be Ordered

2. Inventory: Describes the inventory management of the products in the system, including its quantity.<br>

    Attributes:<br>

    - Item ID: PK, FK, Identifies Items In Inventory Uniquely

    - Quantity: Declares The Available Quantity Of An Item

3. Customer: Describes the relations and attributes customers have in the system.<br>

    Attributes:<br>

    - Customer ID: PK, Identifies Customers Uniquely

    - Customer Name: Naming Customers

    - Balance: Describes How Much Money Customers Deposited In Their Account

4. Order: Manages the relationship between customers and products as an order.<br>

    Attributes:<br>

    - Order ID: PK, Identifies Orders Uniquely

    - Customer ID: FK, Identifies Customers Ordering

    - Item ID: FK, Identifies Items Ordered

    - Order Quantity: Evaluates The Quantity Of The Ordered Item

### Resources Relationships

- Inventory <-> Item: One to One, as if each item has one entry in the inventory.<br>

- Item <-> Order: One to Many, as if each item Can be Ordered Many Times.<br>

- Customer <-> Order: One to Many, as if each customer can Make Many orders.<br>

  

## Description of each ER resource methods

  

## OpenAPI specification Design

  

## Coming SOON