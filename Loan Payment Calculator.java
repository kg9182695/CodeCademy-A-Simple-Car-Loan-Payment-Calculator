public class CarLoan {
	public static void main(String[] args) {
    
// Create an int variable called carLoan and set it equal to 10000
    int carLoan = 10000;
    // Next, create an int variable called loanLength and set it equal to 3. This will represent a loan length of 3 years.
    int loanLength = 3;
    // Now create an int variable called interestRate and set it equal to 5. This will represent an interest rate of 5% on the loan.
    int interestRate = 5;
    /* Next, create an int variable called downPayment and set it equal 2000. This will represent the down payment provided by a user for this car purchase.*/
    int downPayment = 2000;
/* 
Write an if statement that checks whether the loan length is less than or equal to zero or whether the interest rate is less than or equal to zero.
inside of the if statement, print out a helpful error message to the user
*/
    if(loanLength <= 0 || interestRate <= 0){
      System.out.println("Error! You must take out a valid car loan.");
/* 
use else if to check whether the down payment is greater than or equal to the car loan.
Inside of the else if block, print out a helpful message to the user about the down payment and car loan amounts.
*/
    } else if(downPayment >= carLoan){
      System.out.println("The car can be paid in full.");
/*
if none of the previous Boolean expressions evaluate to true, calculate the monthly payment in an else block.
*/
    } else{
/*Inside of the else block, create an int variable called remainingBalance and set it equal to carLoan minus downPayment.*/
      int remainingBalance = carLoan - downPayment;
/*
Since we need the monthly payment, we must convert the loan length from years to months. On the next line, create an int variable called months and set it equal to loanLength times 12.*/
      int months = loanLength * 12;
/*
 Create an int variable called monthlyBalance and set it equal to remainingBalance divided by months. This represents the monthly payment without interest included. 
 */
      int monthlyBalance = remainingBalance / months;
/* 
The user needs to pay interest on the loan borrowed. Create an int variable called interest and set it equal to the monthly balance times the interest rate, divided all by 100.
*/
      int interest = (monthlyBalance * interestRate)/100;
/*
Calculate the final monthly payment. Create an int variable called monthlyPayment and set it equal to the monthly balance plus the interest.
*/
      int monthlyPayment = monthlyBalance + interest;
/* 
print out the monthly payment. If you correctly completed this project, the console should print out 233 as the monthly payment.
*/
      System.out.println(monthlyPayment);
    }

	}
}