import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class HelloWorldSpec extends AnyFlatSpec with Matchers{
  "Hello World" should "not be an empty String" in {

    //Dato de prueba
    val helloWorld = "Hello World"

    //Prueba
    helloWorld should not be ("")
    helloWorld shouldBe a [String]
    helloWorld shouldEqual "Hello World"
  }
}
