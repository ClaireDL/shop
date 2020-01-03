package com.clairedl.scala

class CustomerRecordAnalyser(loader: CustomerRecordLoader, filter: CustomerRecordFilter) {

  private val record = loader.load()
  private val filtered = filter.filter(record)

  /**
  * Calculates the average for countable sections
  * (amount spent, frequency of visits)
  */
  def average(criteria: String) = {

    var result = 0.0

    criteria match {
      case "frequency" => filtered.foreach(result += _.frequency)
      case "amount" => filtered.foreach(result += _.amount)
    }

    Math.round(result / filtered.length* 100.00) / 100.00
  }
}
