package java;
public class Account {
    int accno;
    String acctype;
    String accholder;
    double balance;

    Account(int accno, String acctype, String accholder, double balance){
        this.accno = accno;
        this.acctype = acctype;
        this.accholder = accholder;
        this.balance = balance;
    }

    public void print(){
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                            Account Info                                      ");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("   Account Number            : " + accno);
        System.out.println("   Account Type              : " + acctype);
        System.out.println("   Account Holder            : " + accholder);
        System.out.println("   Balance                   : " + accholder);
        System.out.println("   Allowance Pay             : " + balance);
        System.out.println("------------------------------------------------------------------------------");
    }

    public void deposit(double amt){
        balance = balance + amt;
        System.out.println("  Account Balance Updated! Current Balance:  " + balance);
    }

    public void withdraw(double amt){

        if(amt > balance){
            System.out.println("Insufficient Funds!");
        }
        else{
        balance = balance - amt;
        System.out.println("  Account Balance Updated! Current Balance:  " + balance);
        }
    }

    public static void main(String[] args){
        Account A1 = new Account(4590,"Savings","Rudra",22391.0);
        A1.print();
        A1.deposit(4500.0);

        Account A2 = new Account(3590,"Savings","Darshan",500.0);
        A2.print();
        A2.withdraw(1200);

    }
}
