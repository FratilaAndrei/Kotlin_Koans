import java.util.*
import kotlin.collections.Collection

//fun <T: String> Iterable<T>.partitionTo(par1:  Collection<T>, par2 : Collection<T>, predicate: (T) -> Boolean ) : Collection<T> {
//    var (par1, par2) = this.partition(predicate)
//

fun <T,C: MutableCollection<T>> Collection<T>.partitionTo(first: C, second: C, predicate: (T) -> Boolean): Pair<C,C>{
    for(element in this){
        if(predicate(element)){
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first,second)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
        .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
        .partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}