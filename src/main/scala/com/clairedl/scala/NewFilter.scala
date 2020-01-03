package com.clairedl.scala

abstract class FilterResult(customerRecord: List[CustomerRecord]) {
  def filter(): Unit
}

class FrequencyAmountFilterResult(
    customerRecord: List[CustomerRecord],
    val frequency: Int,
    val min: Double,
    val max: Double
) extends FilterResult(customerRecord) {

  def filter(): Unit = {
    val filter1 = customerRecord.filter(_.frequency)
  }
}
