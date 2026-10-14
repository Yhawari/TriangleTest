import java.util.Random;
import java.util.Scanner;

public class TriangleMain {
	
	public static void main(String[] args) {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("How many triangles do you want to generate ? ");
        int numTri = scan.nextInt();
        Triangle [] t = new Triangle[numTri];
        
        System.out.println("Sides        perimeter     type");
        System.out.println("-----        ---------     ----");
                
        for(int i = 0; i< t.length; i++){
            int side1 = 0,side2 = 0,side3 = 0;

            while(!Triangle.isValid(side1, side2, side3)){
                side1 = r.nextInt(11);
                side2 = r.nextInt(11);
                side3 = r.nextInt(11);
            }
            
            t[i] = new Triangle(side1 , side2, side3);
        }
        
        for (int i = 0 ; i < t.length ; i++){
            System.out.print(t[i] + "        " + t[i].getPerimeter() + "        ");
        
            if(t[i].isEquilateral())
                System.out.println("Equilateral");
            else if(t[i].isIsosceles()){
                System.out.println("Isosceles     ");
                if(t[i].isRight())
                    System.out.println("Riht");
            }
            else{
                System.out.println("Scalene     ");
                if(t[i].isRight())
                    System.out.println("Right");
            }
        }
    }
}
