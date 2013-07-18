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

val t=new Time

t.hour

t.minute=1


//Example directly define getter and setter methods

class Thermometer {
  var celsius: Float = _
  def fahrenheit = celsius * 9 / 5 + 32
  def fahrenheit_= (f: Float) {
    celsius = (f - 32) * 5 / 9
  }
  override def toString = fahrenheit +"F/"+ celsius +"C"
}






