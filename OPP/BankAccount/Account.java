public class Account{
    private String accountHolderName;
    private String accountNumber;
    private double initialBalance;
    private double balance;
    public Account(String accountHolderName,String acccountNumber,double initialBalance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.initialBalance=initialBalance;
        this.balance=initialBalance;
        
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getInitialBalance(){
        return initialBalance;
    }
    public void deposit(double amount){
        if(amount>0){
        balance+=amount;
        System.out.println("Desposited "+amount+"\nYour Balance is "+balance);
        }
        else{System.out.println("Deposit faild.Ammount should be positive Number");}
    }
    public double getBalance(){
        return balance;
    }
    }
