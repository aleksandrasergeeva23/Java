import java.util.Scanner;

public class HospitallBill {
    public static boolean overnightStay() {
        boolean stay = false;
        Scanner answer = new Scanner(System.in);
        System.out.println("Do you stay overnight at the hospital ?");
        String response = answer.next();
        if (response.equalsIgnoreCase("yes")){
            return true;
        }
        else {return false;}
    }

    public static void main(String[] args) {
        String response;
        do {
        double total = 0;
        Scanner answer = new Scanner(System.in);
        if(overnightStay()){
            System.out.println("Enter the cost of your stay please: ");
            total += answer.nextDouble();
        }
        System.out.println("What were your lab expenses ?");
        total += answer.nextDouble();
        System.out.println("What were your medication charges ?");
        total += answer.nextDouble();
        System.out.printf("The total cost for this patient is: $%6.2f", total);
        System.out.println();
        System.out.println("Do you want to calculate it for another patient ?");
        response = answer.next();
    } while (response.equalsIgnoreCase("yes"));

    }
}
