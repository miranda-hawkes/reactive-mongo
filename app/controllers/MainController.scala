package controllers

import javax.inject.Inject
import play.api.mvc._
import scala.concurrent.Future

class MainController @Inject()(val cc: ControllerComponents) extends AbstractController(cc) {

  val helloWorld: Action[AnyContent] = Action.async {
    Future.successful(Ok("Hello, world"))
  }
}
