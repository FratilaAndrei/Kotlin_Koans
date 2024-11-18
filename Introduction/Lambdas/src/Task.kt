fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { it % 2 == 0 }
        // collection.any { it -> it % 2 == 0 }

