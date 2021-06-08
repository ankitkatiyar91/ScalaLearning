//User class with constant `name`. Value of the name cannot be changed
class User(name: String) {

  override def toString: String = "User name: " + name

  def name(): String = name;

}
