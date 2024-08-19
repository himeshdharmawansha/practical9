object StringFormatter {

  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String, formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {

    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    println(formatNames(name1, toUpper));
    println(formatNames(name2.substring(0, 2), toUpper) + formatNames(name2.substring(2), toLower));
    println(formatNames(name3, toLower));
    println(formatNames(name4.substring(0, 1), toUpper) + formatNames(name4.substring(1, 5), toLower) +    formatNames(name4.substring(5), toUpper));
  }
}

