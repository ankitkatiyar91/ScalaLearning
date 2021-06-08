object PersonTest {

  def main(args: Array[String]): Unit = {
    val person = new Person

    // calling setter
    person.name = "Raju"

    println(person)
    println(person.name)
  }

}
