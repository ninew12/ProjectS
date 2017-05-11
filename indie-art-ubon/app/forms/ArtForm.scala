/*
package forms

import play.api.data.Form
import play.api.data.Forms._

object ArtForm {

  val form = Form(
    mapping(
      "userID" -> nonEmptyText,
      "title" -> nonEmptyText,
      "detail" -> nonEmptyText,
      "modelType" -> nonEmptyText
    )(Data.apply)(Data.unapply)
  )

  case class Data(
      userID: String,
      title: String,
      detail: String,
      modelType: String
  )
}
*/
