// Return all products the given customer has ordered
fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap(Order::products)
// ne returneaza toata produsele din comenzile instantei de customer
//

// Return all products that were ordered by at least one customer
fun Shop.getOrderedProducts(): Set<Product> = customers.flatMap(Customer::getOrderedProducts).toSet()

// all products -> ordered -> >= 1 customer
// reverse logic would be
// check if any customers has ordered and return the products that they ordered.


// mapam peste customers ca sa acesam comenzile facute de ei,
// apoi mapam peste comenzi ca sa aflam produsele.
// trebuie verificat daca produsul a fost comandat cel putin odata
// Customer -> order -> produs
// customer ordered > 1


/*
 My version that still works.

fun Customer.getOrderedProducts(): List<Product> =
        this.orders.flatMap { it.products }



fun Shop.getOrderedProducts(): Set<Product> {
        val customerWithOrder = customers.filter { it.orders.isNotEmpty() }.toSet()
        // lista de customers cu 1 order
        val ordersList = customerWithOrder.flatMap { it.orders }
        val products = ordersList.flatMap { it.products }
        return products.toSet()
}

 */


