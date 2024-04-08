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

### Product Collection Resource (/item)

| HTTP request | Operation | Description | HTTP status codes | Request sample | Response sample |
|--------------|-----------|-------------|-------------------|----------------|-----------------|
| `POST /item` | Create | Creates a new item | 201 Created, 400 Bad Request, 415 Unsupported Media Type, 500 Internal Server Error, 503 Service Unavailable, 429 Too Many Requests | `{"Name":"Coffee","Price":17}` | `{"ItemID":1,"Name":"Coffee","Price":17,"Avalible":"No"}` |
| `GET /item` | Read | Retrieves All items | 200 OK, 204 No Content, 500 Internal Server Error, 503 Service Unavailable, 429 Too Many Requests | `NA` | `{"ItemID":1,"Name":"Coffee","Price":17,"Avalible":"No"}` |
| `GET /item/{id}` | Specific Read | Retrieves a specific item | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `NA` | `{"ItemID":1,"Name":"Coffee","Price":17,"Avalible":"No"}` |
| `PUT /item/{id}` | Update | Updates a specific item | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `{"Name":"Coffee","Price":18}` | `{"ItemID":1,"Name":"Coffee","Price":18,"Avalible":"No"}` |
| `PATCH /item/{id}` | Partial Update | Partially updates a specific item | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `{"Price":18}` | `{"ItemID":1,"Name":"Coffee","Price":18,"Avalible":"No"}` |
| `DELETE /item` | Delete | Deletes All items | 200 OK, 204 No Content, 500 Internal Server Error, 503 Service Unavailable, 429 Too Many Requests | `NA` | `{ "message": "All items has been deleted successfully." }` |
| `DELETE /item/{id}` | Specific Delete | Deletes a specific item | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `NA` | `{ "message": "item 1 has been deleted successfully." }` |

### Inventory Collection Resource (/inventory)

| HTTP request | Operation | Description | HTTP status codes | Request sample | Response sample |
|--------------|-----------|-------------|-------------------|----------------|-----------------|
| `GET /inventory` | Read | Retrieves All inventory records | 200 OK, 204 No Content, 500 Internal Server Error, 503 Service Unavailable, 429 Too Many Requests | `NA` | `{"ItemID":1,"Quantity":"0"}` |
| `GET /inventory/{id}` | Specific Read | Retrieves a specific inventory record | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `NA` | `{"ItemID":1,"Quantity":"0"}` |
| `PUT /inventory/{id}` | Update | Updates a specific inventory record | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `{"Quantity":100}` | `{"ItemID":1,"Quantity":"100"}` |
| `PATCH /inventory/{id}` | Partial Update | Partially updates a specific inventory record | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `{"Quantity":100}` | `{"ItemID":1,"Quantity":"100"}` |

### Customer Collection Resource (/customer)

| HTTP request | Operation | Description | HTTP status codes | Request sample | Response sample |
|--------------|-----------|-------------|-------------------|----------------|-----------------|
| `POST /customer` | Create | Creates a new customer | 201 Created, 400 Bad Request, 415 Unsupported Media Type, 500 Internal Server Error, 503 Service Unavailable, 429 Too Many Requests | `{"Name":"Ahmad","Balance":200}` | `{"CustomerID":1,"Name":"Ahmad","Balance":200}` |
| `GET /customer` | Read | Retrieves All customers | 200 OK, 204 No Content, 500 Internal Server Error, 503 Service Unavailable, 429 Too Many Requests | `NA` | `{"CustomerID":1,"Name":"Ahmad","Balance":200}` |
| `GET /customer/{id}` | Specific Read | Retrieves a specific customer | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `NA` | `{"CustomerID":1,"Name":"Ahmad","Balance":200}` |
| `PUT /customer/{id}` | Update | Updates a specific customer | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `{"Name":"Ahmad","Balance":250}` | `{"CustomerID":1,"Name":"Ahmad","Balance":250}` |
| `PATCH /customer/{id}` | Partial Update | Partially updates a specific customer | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `{"Balance":250}` | `{"CustomerID":1,"Name":"Ahmad","Balance":250}` |
| `DELETE /customer` | Delete | Deletes All customers | 200 OK, 204 No Content, 500 Internal Server Error, 503 Service Unavailable, 429 Too Many Requests | `NA` | `{ "message": "All customers has been deleted successfully." }` |
| `DELETE /customer/{id}` | Specific Delete | Deletes a specific customer | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `NA` | `{ "message": "Customer 1 has been deleted successfully." }` |

### Order Collection Resource (/order)

| HTTP request | Operation | Description | HTTP status codes | Request sample | Response sample |
|--------------|-----------|-------------|-------------------|----------------|-----------------|
| `POST /order` | Create | Creates a new order | 201 Created, 400 Bad Request, 415 Unsupported Media Type, 500 Internal Server Error, 503 Service Unavailable, 429 Too Many Requests | `{"CustomerID":1,"ItemID":1,"OrderQuantity":1}` | `{"OrderID":1,"CustomerId":1,"productId":1,"OrderQuantity":1}` |
| `GET /order` | Read | Retrieves All orders | 200 OK, 204 No Content, 500 Internal Server Error, 503 Service Unavailable, 429 Too Many Requests | `NA` | `{"OrderID":1,"CustomerId":1,"productId":1,"OrderQuantity":1}` |
| `GET /order/{id}` | Specific Read | Retrieves a specific order | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `NA` | `{"OrderID":1,"CustomerId":1,"productId":1,"OrderQuantity":1}` |
| `PUT /order/{id}` | Update | Updates a specific order | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `{"CustomerId":1,"productId":1,"OrderQuantity":2}` | `{"OrderID":1,"CustomerId":1,"productId":1,"OrderQuantity":2}` |
| `PATCH /order/{id}` | Partial Update | Partially updates a specific order | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `{"OrderQuantity":2}` | `{"OrderID":1,"CustomerId":1,"productId":1,"OrderQuantity":2}` |
| `DELETE /order` | Delete | Deletes All orders | 200 OK, 204 No Content, 500 Internal Server Error, 503 Service Unavailable, 429 Too Many Requests | `NA` | `{ "message": "All orders has been deleted successfully." }` |
| `DELETE /order/{id}` | Specific Delete | Deletes a specific order | 200 OK, 204 No Content, 400 Bad Request, 404 Not Found, 500 Internal Server Error | `NA` | `{ "message": "order 1 has been deleted successfully." }` |

## OpenAPI specification Design

  

## SpringBoot Implementation

Coming SOON