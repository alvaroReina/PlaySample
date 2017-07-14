package models

/**
  * Created by Alvaro on 14/07/2017.
  */
case class Review
(var id: Option[Long],
 var productId: Option[Long],
 var author: String,
 var comment: String) {
  override def toString: String = {
    "Review { id: " + id.getOrElse(0) + ", productId: " + productId.getOrElse(0) +
      ", author: " + author + ", comment: " + comment + "}"
  }
}
