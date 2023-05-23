public abstract class Loan implements LoanConstants {
    
    protected int loanNumber, termLength;
    protected double loanAmount, interestRate;
    protected String customerLastName;
    

    public Loan (int loanNumber, int termLength, double loanAmount, String customerLastName){
            this.loanNumber = loanNumber;
            this.termLength = termLength;
            this.loanAmount = loanAmount;
            this.customerLastName = customerLastName;
    }


    protected double validateLoanAmount(double loanAmount){
        if(loanAmount > LoanConstants.maxLoanAmount){
        throw new IllegalArgumentException("Maximum loam amount is" + LoanConstants.maxLoanAmount);
    }
    return maxLoanAmount;
    }
    

    protected int validateTermLength (int termLength){
        if(termLength != LoanConstants.shortTerm && termLength != LoanConstants.mediumTerm && termLength != LoanConstants.longTerm){
            throw new IllegalArgumentException("Invalid loan term");
        }
        return LoanConstants.shortTerm;
    }

    // public boolean eaquals(Object loan){
    //     if(loan.loanAmount == )
    // } 

    @Override
    public String toString() {
    return "Loan Number: " + this.loanNumber + "\n"
         + "Loan Term: " + this.termLength + "\n"
         + "Loan Amount: " + this.loanAmount + "\n"
         + "Customer: " + this.customerLastName;
}
}
