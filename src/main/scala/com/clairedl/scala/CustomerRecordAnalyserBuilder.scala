package com.clairedl.scala

abstract class CustomerRecordAnalyserBuilder {

  protected def loader: CustomerRecordLoader

  protected def filter: CustomerRecordFilter

}

  /**
  * - loads customerRecord.csv
  * - applies no filter
  */
object DefaultBuilder extends CustomerRecordAnalyserBuilder {

  protected def loader: CustomerRecordLoader = new FileCustomerRecordLoader("customerRecord.csv")

  protected def filter: CustomerRecordFilter = new NoFilter

  def build(): CustomerRecordAnalyser = new CustomerRecordAnalyser(loader, filter)

}

  /**
  * - loads customerRecord.csv
  * - filters in amounts of less than 400
  */
object FileAmountUnder400Builder extends CustomerRecordAnalyserBuilder {

  protected def loader: CustomerRecordLoader = new FileCustomerRecordLoader("customerRecord.csv")

  protected def filter: CustomerRecordFilter = new MaximumFrequencyFilter(400)

  def build(): CustomerRecordAnalyser = new CustomerRecordAnalyser(loader, filter)

}
