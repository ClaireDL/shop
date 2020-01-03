package com.clairedl.scala

case class Customer(
  firstName: String,
  lastName: String,
  email: String
) {

  override def toString(): String = {
    s"$firstName $lastName ($email)"
  }
}
