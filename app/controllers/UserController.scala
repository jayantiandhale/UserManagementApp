package controllers

import play.api.mvc.ControllerComponents
import akka.http.scaladsl.model.HttpHeader.ParsingResult.Ok
import play.api.mvc.AbstractController
import javax.inject.Inject
import play.mvc.Action
import play.api.libs.json._
import models.User
/**
 * Controllers
 * - have helper methods available to execute actions 
 * eg. Object Mycontroller extends Controller{
 * }

 * #Action returns the result. Play takes the result and provide result builders to configure response
 * helper methods: 
 * OK() - 200 response
 * BadRequest() - 401
 * InternalServerError() - 500
 * NotFound() - 403
 * ... 
 * 
 * types passed in helper method:
 * i.e. Ok("") - text/plain
 * Ok(views.index.html) - text/html
 * Ok(someJsonObject) - apllication/json
 * Ok(new File("a.xls")) - application/vnd.ms-excel

 */
/**
 * This class implements basic CRUD on User 
 */
class UserController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {
  def users() = Action{
    Ok("Return all existing users!")
  }
  /**
   * This method will be used to return user's information 
   */
  def user(user_id: Int) = Action {

    Ok("User found!")
  }
  
  def add(user_id: Int) = Action{
    Ok("user added")
  }
/*  def add(user_id: Int, name: String, high_score: Int, last_login: String) = Action{
    Ok(Json.obj("result" -> User(user_id, name, high_score, last_login)))
  }*/
  
  def edit(user_id: Int) = Action{
    Ok("user updated")
  }
  def delete(user_id: Int) = Action{
    Ok("user deleted")
  }

} 