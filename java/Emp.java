package java;
public class Emp {
    int empno;
    String empname;
    double bpay;
    String Jdate;
    double allowance;
    double totalpay;


    Emp(int empno, String empname, double bpay, String Jdate, double allowance){
        this.empno = empno;
        this.empname = empname;
        this.bpay = bpay;
        this.Jdate = Jdate;
        this.allowance = allowance;
        this.totalpay = 0.0;
    }

    public void print(){

        totalpay = bpay + allowance;
        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                            Employee Pay Slip                                 ");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("   Employee Name            : " + empname);
        System.out.println("   Employee Number          : " + empno);
        System.out.println("   Joining Date             : " + Jdate);
        System.out.println("   Base Pay                 : " + bpay);
        System.out.println("   Allowance Pay            : " + allowance);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("   Total Pay                : " + totalpay);
        System.out.println("------------------------------------------------------------------------------");
    }
    public static void main(String[] args){

        Emp[] E = new Emp[2];

        E[0] = new Emp( 219,"Rudra", 125750.0, "19/02/2014", 8500.0);
        E[1] = new Emp( 256,"Rohit", 102550.0, "10/05/2017", 3500.0);

        for(int i = 0; i < 2; i++){
            E[i].print();
        }

    }
}
