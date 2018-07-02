package models
import play.api.libs.json._

object User {
  implicit val userWrites = new Writes[User] {
    def writes(user: User) = Json.obj(
        "user_id" -> user.user_id,
        "name" -> user.name,
        "high_score" -> user.high_score,
        "last_login" -> user.last_login
        )
        }
} 
case class User(user_id: Int, name: String, high_score: Int, last_login: String)
  
  
