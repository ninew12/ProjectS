package forms

import play.api.data.Form
import play.api.data.Forms._

object forumForm {

val form = Form(
    mapping(
     "forumID"-> nonEmptyText,
      "title" -> nonEmptyText,
      "detail" -> nonEmptyText,
      "imagepost" -> nonEmptyText,
      "vdopost" -> nonEmptyText
    )(Data.apply)(Data.unapply)
  )

  case class Data(
    forumID: String,
    title: String,
    detail: String,
    imagepost: String,
    vdopost: String)
  }
