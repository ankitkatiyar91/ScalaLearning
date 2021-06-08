package scala.classes

class Person {
  private var _name: String = ""
  private var _salary: Int = 0
  //  `null` in java is `_` in scala
  var designation: String = _

  //  Getter for name property
  def name = _name

  //  Setter for _name property.
  def name_=(name: String) {
    println("name setter called with value: " + name + " and current value is:" + _name)
    _name = name
  }

  def salary = _salary
}
