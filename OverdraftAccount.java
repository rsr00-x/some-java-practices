public class OverdraftAccount extends BankAccount
{
private float limit;
public void withdraw(float anAmount) // Overriding method
{
if ((anAmount>0.0) && (getBalance()+limit>anAmount))
balance = balance - anAmount;
}
}