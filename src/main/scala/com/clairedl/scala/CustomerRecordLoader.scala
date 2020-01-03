package com.clairedl.scala

import scala.io._

trait CustomerRecordLoader {
  def load(): List[CustomerRecord]
}

class FileCustomerRecordLoader(val filepath: String) extends CustomerRecordLoader {
  def load(): List[CustomerRecord] = {
    Source
      .fromFile(filepath)
      .getLines()
      .map { line =>
        val split = line.split(",")
        CustomerRecord(Customer(split(0),split(1), split(2)), split(3), split(4).toInt, split(5).toDouble, split(6).toInt)
      }
    .toList
  }
}
