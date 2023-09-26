import java.util.*;
import java.text.*;
class Main{
    public static void main(String[] args){
        final byte monthsInYear=12;
        final byte percent=100;
        int Principal=0;
        float monthlyInterest=0;
        int NumberOfPayments=0;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.print("Principal:");
            Principal=sc.nextInt();
            if(Principal>=1000 && Principal<=1_000_000){
            break;
            }
            System.out.println("Enter a value between 1000 and 1_000_000");
        }
        while(true){
            System.out.print("Annual Interest Rate:");
            float annualInterest=sc.nextFloat();
            if(annualInterest>=1 && annualInterest<=30){
            monthlyInterest=annualInterest / percent / monthsInYear;
            break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        while(true){
            System.out.print("Period(years):");
            byte years=sc.nextByte();
            if(years>=1 && years<=30){
                NumberOfPayments=years*monthsInYear;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        double mortgage=Principal*monthlyInterest*Math.pow(1+monthlyInterest,NumberOfPayments)/(Math.pow(1+monthlyInterest,NumberOfPayments)-1);
        String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("mortgage:"+mortgageFormatted);
    }
}