package com.clairedl.scala

case class CustomerRecord(
  customer: Customer,
  fidelityGroup: String,
  order: Int,
  amount: Double,
  frequency: Int
){

  override def toString(): String = {
    s"\n$customer, total amount spent: $amount " +
    s"($frequency visits, $fidelityGroup member, last order: $order"
  }
}
