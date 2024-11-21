// Return a customer who has placed the maximum amount of orders
fun Shop.getCustomerWithMaxOrders(): Customer? =
        customers.maxByOrNull { it.orders.size }

// Return the most expensive product that has been ordered by the given customer
fun getMostExpensiveProductBy(customer: Customer): Product? = customer.orders.flatMap(Order::products).maxByOrNull(Product::price)

// din lista de comenzi ale unui customer, afisam produsele comandate, iar din ele cautam cel mai scump


/*

fun getMostExpensiveProductBy(customer: Customer): Product? {
        my first variant
    val productsList = customer.orders.flatMap(Order::products)
    val res = productsList.maxByOrNull { it.price }
    return res
}


 */