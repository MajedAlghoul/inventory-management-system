# inventory-management-system

This project includes X sections

## section 1: ER Diagram design
![Alt text](ER_Diagram.png "ER Diagram")
### Resources Description
1. Item: Describes the relations and attributes a product in the system has.<br>
    Attributes:<br>
    <ol type="a">
    <li>Item ID: PK, Identifies Items Uniquly</li>
    <li>Item Name: Describes Items</li>
    <li>Item Price: Gives Value TO Items</li>
    <li>Item Avalibility: Evaluates If The Item Can Be Ordered</li>
    </ol>
2. Inventory: Describes the inventory management of the products in the system, including its quantity.
    Attributes:
    A)Item ID: PK, FK, Identifies Items In Inventory Uniquly
    B)Quantity: Declears The Avalible Quantity Of An Item
3)Customer: Describes the relations and attriburs customers have in the system.
    Attributes:
    A)Customer ID: PK, Identifies Customers Uniquly
    B)Customer Name: Naming Customers
    C)Balance: Describes How Much Money Customers Deposited In Their Account
4)Order: Manages the relationship between customers and products as an order.
    Attributes:
    A)Order ID: PK, Identifies Orders Uniquly
    B)Customer ID: FK, Identifies Customers Ordering
    C)Item ID: FK, Identifies Items Ordered
    D)Order Quantity: Evaluates The Quantity Of The Ordered Item
### Resources Relationships
Inventory <-> Item: One to One, as if each item has one entery in the inventory.<br>
Item <-> Order: One to Many, as if each item Can be Ordered Many Times.
Customer <-> Order: One to Many, as if each customer can Make Many orders.
## Section 2: Description of each ER resource methods

## section 3: OpenAI specification Design

Section X: Coming SOON