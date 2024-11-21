// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> = customers.filter {
    val (delivered, undelivered) = it.orders.partition { order -> order.isDelivered  }
    delivered.count() < undelivered.count()
}.toSet()


/*
    val (undeliveredOrders,deliveredOrders ) = customers.partition { it -> it.orders.count() { it.isDelivered } < it.orders.count() { !it.isDelivered } }
    return undeliveredOrders.toSet()
   My version
 */




