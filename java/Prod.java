package java;
public class Prod {

    int itemcode;
    String itemname;
    int qnty;
    float price;

    Prod(int itemcode, String itemname, int qnty, float price){
        this.itemcode = itemcode;
        this.itemname = itemname;
        this.qnty = qnty;
        this.price = price;
    }

    public void printheader(){
        System.out.println(" Item Code      Item Name       Qnty        Price       Total");
        System.out.println("-----------------------------------------------------------------");

    }

    public void print(){
        System.out.println(" " + itemcode + "       " + itemname + "        " + qnty + "        " + price + "       " + (qnty * price));

    }

    public void printfooter(){
        System.out.println("-----------------------------------------------------------------");
    }

    public static void main(String[] args){

        Prod P1 = new Prod(219,"House-Plant",2,45.0f);
        Prod P2 = new Prod(69,"Dildo",1,945.0f);
        Prod P3 = new Prod(420,"Weed",1,1225.0f);

        P1.printheader();
        P1.print();
        P2.print();
        P3.print();
        P2.printfooter();

        double total = (P1.qnty*P1.price ) + (P2.qnty*P2.price ) + (P3.qnty*P3.price );
        double VAT = total * 2 /100;
        double grandtotal = total + VAT;
        System.out.println("\t\t\t\t\t\t\t VAT: " + VAT);
        System.out.println("\t\t\t\t\t\t\t Grand Total: " + grandtotal);
        P2.printfooter();

    }
}
