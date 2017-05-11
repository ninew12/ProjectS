package models

import java.util.UUID
import play.api.Play
import play.api.db.slick.DatabaseConfigProvider
import scala.concurrent.Future
import slick.driver.JdbcProfile
import slick.driver.H2Driver.api._
import scala.concurrent.ExecutionContext.Implicits.global
import slick.lifted.ProvenShape.proveShapeOf
import models.daos._


case class ArtWork(
  id: String,
  userid: String, // user: User
  title: String,
  detail: Option[String],
  tags: Option[String],
  modelType: Option[String]
  )

  case class Collection(
      id: String,
      userid: String,
      artworkid: String,
      name: Option[String]

  )
  class artworks(tag: Tag) extends Table[ArtWork](tag, "artwork") {
    def id = column[String]("id", O.PrimaryKey)
    def userID = column[String]("userID")
    def title = column[String]("title")
    def detail = column[Option[String]]("detail")
    def tags = column[Option[String]]("tags")
    def modelType = column[Option[String]]("modelType")
  //  def date = column[Option[java.sql.Date]]("date")
    def * = ( id, userID, title, detail, tags, modelType ) <> (ArtWork.tupled, ArtWork.unapply)
  }

  class collections(tag: Tag) extends Table[Collection](tag, "foruminfo") {
    def  id = column[String]("id", O.PrimaryKey)
    def  userid = column[String]("userid")
    def  artworkid = column[String]("artworkid")
    def  name = column[Option[String]]("imagepost")
    def * = (id, userid,  artworkid, name ) <> (Collection.tupled, Collection.unapply)
  }



  object addcollection {

    val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)

    val dbcol = TableQuery[collections]

    //def add(role: Collection): Future[String] = {
    //  dbConfig.db.run(dbcol += role).map(res => "successfully").recover {
        //case ex: Exception => ex.getCause.getMessage
      //}
    //}

    def listAll: Future[Seq[Collection]] = {
      dbConfig.db.run(dbcol.result)
    }
  }
