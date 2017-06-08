package chap13

class PackageTest {

  private def test(): Unit = {
    println("test")
  }

  def execute(): Unit = {
    val t = new PackageTest
    t.test()
  }

}
