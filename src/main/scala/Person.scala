class Person {
  private var _name: String = ""
  private var _salary: Int = 0
  private var designation: String = null

  //  Getter for name property
  def name = _name

  //  Setter for _name propety.
  def name_=(name: String) {
    println("name setter called with value: " + name + " and current value is:" + _name)
    _name = name
  }
}
