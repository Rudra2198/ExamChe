package java;
class Student{

    int no;
    String name;
    int m1, m2, m3, m4, m5, m6;

    Student(int no, String name, int m1 , int m2, int m3, int m4, int m5, int m6){
        this.no = no;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
        this.m6 = m6;
    }

    void print(){

        int total = m1 + m2 + m3 + m4 + m5 + m6;
        double percent = (double) total / 6;
        String result = "";

        if (percent >= 40){
            result = "Pass";
        }
        else{
            result = "Fail";
        }

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("                        G H Patel Department of Computer Science and Technology                        ");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("    M1: " + m1 + "    M2: " + m2 + "    M3: " + m3 + "    M4: " + m4 + "    M5: " + m5 + "    M6: " + m6);
        System.out.println("\n \n \n \n");
        System.out.println("    Percentage Obtained : " + percent);
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("  Result: " + result);
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }


    public static void main(String[] args){

        Student[] DCA = new Student[5];

        DCA[0] = new Student(1069,"Rudra",80,89,90,93,95,97);
        DCA[1] = new Student(1070,"Darshan",80,89,90,93,95,97);
        DCA[2] = new Student(1071,"Aniket",80,40,30,33,55,97);
        DCA[3] = new Student(1072,"Rudra",60,69,90,83,35,77);
        DCA[4] = new Student(1073,"Rudra",64,89,90,93,95,97);
        
        for(int i = 0; i < 5; i++){
            DCA[i].print();
        }

    }
}