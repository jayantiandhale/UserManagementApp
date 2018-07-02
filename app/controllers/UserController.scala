package controllers

import play.api.mvc.ControllerComponents
import akka.http.scaladsl.model.HttpHeader.ParsingResult.Ok
import play.api.mvc.AbstractController
import javax.inject.Inject
import play.mvc.Action
import play.api.libs.json._
import models.User

class UserController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {
  /**
   * This method will be used to return user's information 
   *     
   *     */
  def user(user_id: Int) = Action {
    Ok("User found!")
  }
  
  def add(user_id: Int, name: String, high_score: Int, last_login: String) = Action{
    Ok(Json.obj("result" -> User(user_id, name, high_score, last_login)))
  }
} 