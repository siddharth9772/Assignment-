import java.util.Scanner;

public class p {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("type of building:domestic/commercial");
        String B=sc.nextLine();
        System.out.println("amount insured:");  
        float A=sc.nextFloat();
        System.out.println("previous claims:");
        int c=sc.nextInt();
        double charge;
        double bonus;
        int fixedcharge;
        if(B.equals("d")){
            fixedcharge=50;
             if(A<100000){
                charge=0.003*A;
             }
             else{
                charge=0.0025*A;
             }
            bonus=0.1*(charge+fixedcharge);
            }
        else{
            fixedcharge=80;
                if(A<250000){
                    charge=0.005*A;
                }
                else{
                    charge=0.0075*A;
                }
                bonus=.15*(charge+fixedcharge);
        }
        if(c!=0){
            bonus=0;
        }
        double finalpremium=charge+fixedcharge-bonus;
        System.out.println("final premium:"+finalpremium);

    }
    }
