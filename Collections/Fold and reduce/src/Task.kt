// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> =
//    customers.flatMap {it.orders}.flatMap { it.products }.filter { acc, product -> acc == product  }

    customers.map { it.getOrderedProducts() }.reduce { orderedByAll, customer -> orderedByAll.intersect(customer)  }

//customers.map(Customer::getOrderedProducts).reduce { orderedByAll, customer ->
//    orderedByAll.intersect(customer)

// facem rost de lista totala de produse
// iteram prin toti customers sa aducem toate listele de comenzi cu toate listele de produse cumparata




fun Customer.getOrderedProducts(): Set<Product> =
    orders.flatMap { it.products }.toSet()