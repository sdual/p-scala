package chap15

object Test extends App {

  println(withDefault(Some(10)))

  println(withDefault(None))

  println(second.isDefinedAt(List(1, 2)))

  val second: PartialFunction[List[Int], Int] = {
    case x :: y :: _ => y
  }

  def withDefault: Option[Int] => Int = {
    case Some(x) => x
    case None => 0
  }

}
