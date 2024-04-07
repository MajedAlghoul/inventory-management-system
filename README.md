# inventory-management-system

This is an inventory management system that utilizes rest API and SpringBoot to interact and manage the relationships and transactions between different resources in the system.

## ER Diagram design

![Alt text](/Images/ER_Diagram.png "ER Diagram")

### Resources Description

<Strong>1. Item: Describes the relations and attributes a product in the system has.</Strong><br>

    Attributes:<br>

    - Item ID: PK, Identifies Items Uniquly

    - Item Name: Describes Items

    - Item Price: Gives Value To Items

    - Item Avalibility: Evaluates If The Item Can Be Ordered

<Strong>2.  Inventory: Describes the inventory management of the products in the system, including its quantity.</Strong><br>

    Attributes:<br>

    - Item ID: PK, FK, Identifies Items In Inventory Uniquely

    - Quantity: Declares The Available Quantity Of An Item

<Strong>3. Customer: Describes the relations and attributes customers have in the system.</Strong><br>

    Attributes:<br>

    - Customer ID: PK, Identifies Customers Uniquely

    - Customer Name: Naming Customers

    - Balance: Describes How Much Money Customers Deposited In Their Account

<Strong>4. Order: Manages the relationship between customers and products as an order.</Strong><br>

    Attributes:<br>

    - Order ID: PK, Identifies Orders Uniquely

    - Customer ID: FK, Identifies Customers Ordering

    - Item ID: FK, Identifies Items Ordered

    - Order Quantity: Evaluates The Quantity Of The Ordered Item

### Resources's Relationships

- Inventory <-> Item: One to One, as if each item has one entry in the inventory.<br>

- Item <-> Order: One to Many, as if each item Can be Ordered Many Times.<br>

- Customer <-> Order: One to Many, as if each customer can Make Many orders.<br>

## Description of each ER resource methods

### Products Collection Resource (/products)

| HTTP request | Operation Description | HTTP status codes | Request sample | Response sample |
|--------------|-----------------------|-------------------|----------------|-----------------|
| `GET /products` | Retrieves a list of products | 200 OK | N/A | `[{"id":1,"name":"Product A","price":10.99},{"id":2,"name":"Product B","price":15.49}]` |
| `POST /products` | Creates a new product | 201 Created, 400 Bad Request | `{"name":"Product C","price":12.99}` | `{"id":3,"name":"Product C","price":12.99}` |

### Customers Collection Resource (/customers)

| HTTP request | Operation Description | HTTP status codes | Request sample | Response sample |
|--------------|-----------------------|-------------------|----------------|-----------------|
| `GET /customers` | Retrieves a list of customers | 200 OK | N/A | `[{"id":1,"name":"Alice","email":"alice@example.com"},{"id":2,"name":"Bob","email":"bob@example.com"}]` |
| `POST /customers` | Creates a new customer | 201 Created, 400 Bad Request | `{"name":"Charlie","email":"charlie@example.com"}` | `{"id":3,"name":"Charlie","email":"charlie@example.com"}` |

### Orders Collection Resource (/orders)

| HTTP request | Operation Description | HTTP status codes | Request sample | Response sample |
|--------------|-----------------------|-------------------|----------------|-----------------|
| `GET /orders` | Retrieves a list of orders | 200 OK | N/A | `[{"id":1,"customerId":1,"productId":2,"quantity":1},{"id":2,"customerId":2,"productId":1,"quantity":2}]` |
| `POST /orders` | Creates a new order | 201 Created, 400 Bad Request | `{"customerId":1,"productId":2,"quantity":1}` | `{"id":3,"customerId":1,"productId":2,"quantity":1}` |

### Inventory Collection Resource (/inventory)

| HTTP request | Operation Description | HTTP status codes | Request sample | Response sample |
|--------------|-----------------------|-------------------|----------------|-----------------|
| `GET /inventory` | Retrieves the inventory list | 200 OK | N/A | `[{"productId":1,"quantity":100},{"productId":2,"quantity":150}]` |
| `PUT /inventory/{productId}` | Updates inventory quantity for a product | 200 OK, 404 Not Found | `{"productId":1,"quantity":90}` | `{"productId":1,"quantity":90}` |

## OpenAPI specification Design

  

## Coming SOON