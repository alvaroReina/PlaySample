package models

/**
  * Created by Alvaro on 14/07/2017.
  */
case class Product
(var id: Option[Long],
 var name: String,
 var details: String,
 var price: BigDecimal) {
  override def toString: String = {
    "Product { id: " + id.getOrElse(0) + ", name: " + name + ", " +
      "details: " + details + ", price: " + price + "}"
  }
}
