# Java Inventory Management Program
#Analysis
### Program Functionality:

The program allows users to perform the following actions:

1. Register a Product in the Inventory
   - Users can enter details of a new product, including name, price, and available quantity.
   - The product is added to the inventory.

2. Display List of Available Products
   - Shows a list of all available products in the inventory, along with their names, prices, and quantities.

3. Perform Product Sale
   - Users can select a product to sell.
   - If enough quantity is available, the sale is recorded and the inventory is updated.
   - Insufficient or zero quantity prevents the sale.

4. Generate Sales Report
   - At the end, a report displays the total amount of sales made.

### Required Classes:

1. **Product**
   - **Properties:**
     - `name` (String)
     - `price` (double)
     - `availableQuantity` (int)
   - **Methods:**
     - `Product(String name, double price, int availableQuantity)`
     - Getters for `name`, `price`, and `availableQuantity`

2. **Inventory**
   - **Properties:**
     - `products` (List of Product objects)
   - **Methods:**
     - `addProduct(Product product)`
     - `displayProducts()`

### Visibility and Types:

- In `Product` class:
  - `name`, `price`, `availableQuantity`: Private fields
  - `Product` constructor: Public
  - Getters: Public

- In `Inventory` class:
  - `products`: Private field
  - Methods: Public

### Parameters:

- `Product` constructor: `name` (String), `price` (double), `availableQuantity` (int)
- `addProduct` method: `product` (Product object)

### Initial Values:

Creating objects with initial values:

```java
Product product1 = new Product("Product 1", 10.99, 20);
Product product2 = new Product("Product 2", 25.50, 15);
// ... Create more products

Inventory inventory = new Inventory();
inventory.addProduct(product1);
inventory.addProduct(product2);
// ... Add more products to the inventory

