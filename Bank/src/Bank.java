class Bank{

    int accno;
    String accholder;
    double balance;

    Bank(int accno, String accholder, double balance){
        this.accno = accno;
        this.accholder = accholder;
        this.balance = balance;
    }

    void print(){

        System.out.println("-----------------------------------------------------------");
        System.out.println(" Account Holder's Name :                " + accholder);
        System.out.println(" Account Number :                       " + accno);
        System.out.println(" Bank Balance :                         " + balance);
        System.out.println("-----------------------------------------------------------");

    }

    void deposit(double amt){

        balance += amt;
        System.out.println("-----------------------------------------------------------");
        System.out.println("               Balance Updated Successfully!               ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" Current Bank Balance :                         " + balance);

    }

    public static void main(String[] args){

        Bank B1 = new Bank(111,"XXX",10000.00);
        B1.print();
        B1.deposit(5000.00);
    }
}