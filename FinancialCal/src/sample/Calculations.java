package sample;

public class Calculations {
    //Start Of Mortgage Calculations.

    //Calculate Home Price.
     public static double calculateHomePrice(double downPayment, double loanTerm, double interestRate, double compound){
        double homePrice= (downPayment * ((Math.pow((compound * loanTerm), (1 + (interestRate / compound)))) - 1)) / ((interestRate / compound) * (Math.pow((compound * loanTerm), (1 + (interestRate / compound)))));
         return homePrice;
    }

    //Calculate Down Payment.
    public static double calculateDownPayment(double homePrice, double loanTerm, double interestRate, double compound){
        double downPayment = (homePrice * (interestRate / compound) * ((Math.pow((compound * loanTerm), (1 + (interestRate / compound)))))) / ((Math.pow((compound * loanTerm), (1 + (interestRate/compound)))) - 1);
        return downPayment;
    }

    //Calculate Loan Term.
    public static double calculateLoanTerm( double homePrice, double compound, double interestRate, double downPayment){
        double loanTerm = (Math.log(downPayment / (downPayment - ((homePrice * interestRate) / compound)))) / ((Math.log(1 + (interestRate / compound))) * compound);
        return loanTerm;
    }

    //End Of Mortgage Calculations.

    //Start of Saving Calculations.

    //Calculate InterestRate.
    public static double calculateInterestRate(double startPrincipal, double futureValue, double numberOfPeriods, double compound){
        double interestRate = numberOfPeriods* Math.pow(((futureValue/startPrincipal)), (1/(numberOfPeriods*compound)));
        return interestRate;
    }

    //Calculate Start Principal.
    public static double calculateStartPrincipal(double compound, double interestRate, double futureValue, double numberOfPeriods){
        double startPrincipal = futureValue * Math.pow((1 + (interestRate/compound)),compound*numberOfPeriods);
        return startPrincipal;
    }

    //Calculate Future value.
    public static double calculateFutureValue (double compound, double interestRate, double startPrincipal, double numberOfPeriods){
        double futureValue = startPrincipal * Math.pow((1 + (interestRate/compound)),(compound * numberOfPeriods));
        return futureValue;
    }

    //End of Saving Calculations.


    //Start Of  Loan Calculations.

    //Calculate Loan Amount;
    public static double calculateLoanAmount(double paybackPerMonth, double interestRate, double loanTermInMonths, double compound) {
        double loanAmount = (paybackPerMonth * ((Math.pow((compound * loanTermInMonths), (1 + (interestRate / compound)))) - 1)) / ((interestRate / compound) * (Math.pow((compound * loanTermInMonths), (1 + (interestRate / compound)))));
        return loanAmount;
    }

    //Calculate Pay Back Per Month.
    public static double calculatePaybackPerMonth(double interestRate, double loanAmount, double loanTermInMonths, double compound){
        double payBackPerMonth = (loanAmount * (interestRate / compound) * ((Math.pow((compound * loanTermInMonths), (1 + (interestRate / compound)))))) / ((Math.pow((compound * loanTermInMonths), (1 + (interestRate/compound)))) - 1);
        return payBackPerMonth;
    }

    //Calculate Loan Term In Months.
    public static double loanTermInMonth(double interestRate, double loanAmount, double payBackPerMonth, double compound){
        double loanTermInMonth = (Math.log(payBackPerMonth / (payBackPerMonth - ((loanAmount * interestRate) / compound)))) / ((Math.log(1 + (interestRate / compound))) * compound);
        return loanTermInMonth;
    }

    //End Of Loan Calculations.


    //start Of Fixed Deposit Calculations.

    //Calculate Amount After Time t.
    public static double calculateAmountAfterTimet(double principalAmount, double interestRate, double years, double compound, double monthlyPayment){
        double amountAfterTimet = principalAmount * (Math.pow((compound * years), (1 + (interestRate / compound))) + monthlyPayment * (((Math.pow((compound * years), (1 + (interestRate / compound)))) - 1 ) / (interestRate / compound)));
        return amountAfterTimet;
    }

    //Calculate Principal Amount.
    public static double calculatePrincipalAmount(double interestRate, double amountAfterTimet, double years, double compound, double monthlyPayment){
        double principalAmount = amountAfterTimet - ((monthlyPayment * (Math.pow((compound * years), (1 + (interestRate / compound))) - 1)) / compound) / Math.pow((compound / years), (1 + (interestRate / compound)));
        return principalAmount;
    }

    //Calculate Years.
    public static double calculateYears(double interestRate, double amountAfterTimet, double principalAmount, double compound, double monthlyPayment){
        double years = Math.log((amountAfterTimet + ((monthlyPayment * compound) / interestRate)) / (principalAmount + ((monthlyPayment * compound) / interestRate))) / Math.log((1 + (interestRate / compound)));
        return years;
    }

    //End Of Fixed Deposits Calculations.
}