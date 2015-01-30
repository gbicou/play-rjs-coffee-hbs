package controllers

import play.api.mvc._
import play.api.libs.json._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def demo = Action {
    Ok(Json.obj("name" -> "sbt-hbs"))
  }
  
}

