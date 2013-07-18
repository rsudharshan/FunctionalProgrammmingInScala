/**
 * Created with IntelliJ IDEA.
 * User: Sudharshan
 * Date: 18/7/13
 * Time: 8:28 AM
 */
class BankAccount {
  private var bal: Int = 0
  def balance: Int = bal
  def deposit(amount: Int) {
    if(amount > 0)
    bal += amount
  }
  def withdraw(amount: Int): Boolean =
    if (amount > bal) false
    else {
      bal -= amount
      true
    }
}











































































































class Time {
  var hour = 12
  var minute = 0
}







