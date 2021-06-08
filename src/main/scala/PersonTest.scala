import entities.Person

object PersonTest {

  def main(args: Array[String]): Unit = {
    val person = new Person

    // calling setter
    person.name = "Raju"

    println(person)
    println("Person name: " + person.name)
    println("Person Designation: " + person.designation)
    println("Person Salary: " + person.salary)
  }

}
