@SerialVersionUID(1L)
case class Pair[A, B](first: A, second: B) {
  def toScala: (A, B) = (first, second)
}
object Pair {
  def create[A, B](first: A, second: B): Pair[A, B] = new Pair(first, second)
}
