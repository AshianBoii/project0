import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
         @SuppressWarnings("resource")
        Scanner compName = new Scanner (System.in);
        // getting input 
        System.out.print("Enter the competitors name: "); // get competitors name
        String name = compName.nextLine();
        
        System.out.println("Olympic Javalin Throws "+"\nEnter the distances in meters for " + name);
        double throw1, throw2, throw3; // variable that will store the distances of the throws
         
        System.out.print("Enter the distance for throw 1: "); // get first test score
        throw1 = compName.nextDouble(); // read in the next integer
        System.out.print("Enter the distance for throw 2: "); // get second test score
        throw2 = compName.nextDouble();
        System.out.print("Enter the distance for throw 3: ");
        throw3 = compName.nextDouble();
        System.out.println("Yards"+" \tfeet"+" \tinches"+" \tCm");
        
        double yards1 = throw1*1.093; // converts meters to yards
        double feet1 = yards1*3; // yards-> feet
        double inches1 = feet1*12; // feet-> inches
        double cm1 = throw1*100; // inches -> cm
        
        double roundedyards1 = Math.round(yards1 * 100.0) / 100.0;// rounded yards
        double roundedfeet1 = Math.round(feet1 * 100.0) / 100.0;// rounded feet
        double roundedinches1 = Math.round(inches1 * 100.0) / 100.0; // rounded inches
        double roundedcm1 = Math.round(cm1 * 100.0) / 100.0; // rounded cm
        
        System.out.println(roundedyards1 +"\t"+roundedfeet1+"\t" +roundedinches1+"\t"+roundedcm1); // will print results of throw1 in yards, feet, inches, and cm
        
        double yards2 = throw2*1.093; // converts meters to yards
        double feet2 = yards2*3; // yards-> feet
        double inches2 = feet2*12; // feet-> inches
        double cm2 = throw2*100; // inches -> cm
        
        double roundedyards2 = Math.round(yards2 * 100.0) / 100.0;// rounded yards
        double roundedfeet2 = Math.round(feet2 * 100.0) / 100.0;// rounded feet
        double roundedinches2 = Math.round(inches2 * 100.0) / 100.0;// rounded inches
        double roundedcm2 = Math.round(cm2 * 100.0) / 100.0;// rounded cm
        
        System.out.println(roundedyards2 +"\t"+roundedfeet2+"\t" +roundedinches2+"\t"+roundedcm2); // will print results of throw1 in yards, feet, inches, and cm
        
        double yards3 = throw3*1.093; // converts meters to yards
        double feet3 = yards3*3; // yards-> feet
        double inches3 = feet3*12; // feet-> inches
        double cm3 = throw3*100; // inches -> cm
        
        double roundedyards3 = Math.round(yards3 * 100.0) / 100.0;// rounded yards
        double roundedfeet3 = Math.round(feet3 * 100.0) / 100.0;// rounded feet
        double roundedinches3 = Math.round(inches3 * 100.0) / 100.0;// rounded inches
        double roundedcm3 = Math.round(cm3 * 100.0) / 100.0;// rounded cm
        
        System.out.println(roundedyards3 +"\t"+roundedfeet3+"\t" +roundedinches3+"\t"+roundedcm3); // will print results of throw1 in yards, feet, inches, and cm
        
    } 
}
