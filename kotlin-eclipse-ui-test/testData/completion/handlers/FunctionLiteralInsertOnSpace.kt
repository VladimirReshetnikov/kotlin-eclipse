class Some
fun <T> Some.filter(predicate : (T) -> Boolean) = throw UnsupportedOperationException()

fun main(args: Array<String>) {
    Some().fil<caret>
}

