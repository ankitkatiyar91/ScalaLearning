import java.text.DateFormat._
import java.util.{Date, Locale}

object FrenchDate {

  def main(args: Array[String]): Unit = {

    val df = getDateInstance(LONG, Locale.FRENCH);
    print("date in french: ", df format new Date);
  }
}
