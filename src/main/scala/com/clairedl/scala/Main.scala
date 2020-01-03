package com.clairedl.scala

import org.slf4j.LoggerFactory

object Main extends App {

  println("Welcome to my shop.")

  val records = new FileCustomerRecordLoader("customerRecord.csv")
  val filter = new SpecificFrequencyFilter(5)
  val filter2 = new AmountRangeFilter(10, 500)
  val analyser = new CustomerRecordAnalyser(records, filter2)

  val analysis1 =analyser.average("amount")
  println(s"Result analysis 1: $analysis1")

  val analysis2 = FileUnder400ExpenseBuilder
    .build()
    .average("frequency")

  println(s"Result analysis 2: $analysis2")
}
