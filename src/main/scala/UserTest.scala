import entities.User

object UserTest {
  def main(args: Array[String]): Unit = {
    val user = new User("Ankit")

    println(user)

    println(user.name)

    //    name cannot be changed
    //    user.name = "dfsfs";
  }

}
