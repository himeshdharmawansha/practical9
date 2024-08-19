import scala.io.StdIn.readLine

object deposit{

  def main(args: Array[String]): Unit = {

    val calculateDeposit: Double => Double = deposit => deposit match {
      case x if deposit <= 20000 => 0.02 * deposit
      case x if deposit <= 200000 => 0.04 * deposit
      case x if deposit <= 2000000 => 0.035 * deposit
      case _ => 0.065 * deposit
    }

    var deposit = readLine("Enter your deposit amount (0 to stop) : ").toDouble

    while (deposit != 0) {
      val income: Double = calculateDeposit(deposit)

      println("Annual income for your deposit of Rs." + deposit + " is Rs." + income)

      deposit = readLine("\nEnter a number (0 to stop) : ").toDouble
    }
  }
}

