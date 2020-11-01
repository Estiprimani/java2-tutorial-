import java.util.Scanner;

public class tutorial1 {

    public static void main(String args[]){
        int survey;
        double salary;
        Scanner abc = new Scanner(System.in);
        System.out.println("calculate salary");
        System.out.print("input your survey");
        survey=abc.nextInt();
        int paid=survey%5;
        if(paid==0){
            salary=(survey/5)*70.00;
        }
        else{
            double a=(survey/5)*70.00;
            salary = a+(paid*10.00);
        }
        System.out.print(salary);
    }
}
