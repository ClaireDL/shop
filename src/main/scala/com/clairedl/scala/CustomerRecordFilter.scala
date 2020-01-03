package com.clairedl.scala

abstract class CustomerRecordFilter {
  def filter(customerRecord: List[CustomerRecord]): List[CustomerRecord]
}

class NoFilter()
    extends CustomerRecordFilter {

  def filter(customerRecord: List[CustomerRecord]): List[CustomerRecord] = {
    customerRecord
  }
}

class SpecificFrequencyFilter(frequency: Int)
    extends CustomerRecordFilter {

  def filter(customerRecord: List[CustomerRecord]): List[CustomerRecord] = {
    customerRecord.filter(_.frequency == frequency)
  }
}

class MinimumFrequencyFilter(frequency: Int)
    extends CustomerRecordFilter {

  def filter(customerRecord: List[CustomerRecord]): List[CustomerRecord] = {
    customerRecord.filter(_.frequency >= frequency)
  }
}

class MaximumFrequencyFilter(frequency: Int)
    extends CustomerRecordFilter {

  def filter(customerRecord: List[CustomerRecord]): List[CustomerRecord] = {
    customerRecord.filter(_.frequency <= frequency)
  }
}

class RangeFrequencyFilter(min: Int, max: Int)
    extends CustomerRecordFilter {

  def filter(customerRecord: List[CustomerRecord]): List[CustomerRecord] = {
    customerRecord.filter(x => (x.frequency >= min && x.frequency <= max))
  }
}

class AmountRangeFilter(min: Double, max: Double)
    extends CustomerRecordFilter {

  def  filter(customerRecord: List[CustomerRecord]): List[CustomerRecord] = {
    customerRecord.filter(x => (x.amount > min && x.amount < max))
  }
}
