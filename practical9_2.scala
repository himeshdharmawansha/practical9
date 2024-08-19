import scala.io.StdIn.readLine

object patternMatching {

  def main(args: Array[String]): Unit = {
    
      val checkNum: Int => String = num => num match {
        case x if num <= 0 => "Negative/Zero is input"
        case x if num % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
      }

      var num = readLine("\nEnter a number: ").toInt;

      while (true) {
      
	println(checkNum(num));
        num = readLine("\nEnter a number: ").toInt;
    }
   }
 
}

