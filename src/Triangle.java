
public class Triangle {
	   private int side1 ;
	    private int side2 ;
	    private int side3 ;
	    
	    public Triangle(){
	        side1 = 3;
	        side2 = 4;
	        side3 = 5;
	    }
	    
	    public Triangle(int a, int b, int c){
	        side1 = a;
	        side2 = b;
	        side3 = c;
	        
	    }

	    public int getSide1() {
	        return side1;
	    }

	    public void setSide1(int a) {
	        this.side1 = a;
	    }

	    public int getSide2() {
	        return side2;
	    }
	    
	    public void setSide2(int b) {
	        this.side2 = b;
	    }

	    public int getSide3() {
	        return side3;
	    }

	    public void setSide3(int c) {
	        this.side3 = c;
	    }
	    
	    public static boolean isValid(int s1, int s2, int s3 ){
	        return (s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1);
	      
	    }
	    
	    public boolean isRight(){
	        return(Math.sqrt(side1) + Math.sqrt(side2) == Math.sqrt(side3) || Math.sqrt(side1) + Math.sqrt(side3) == Math.sqrt(side2) ||Math.sqrt(side3) + Math.sqrt(side2) == Math.sqrt(side1)  );
	    }
	    
	    public boolean isIsosceles(){
	        return(side1 == side2 || side1 == side3 || side2 == side3);
	    }
	    
	    public boolean isEquilateral(){
	        return(side1 == side2 && side1 == side3);
	    }
	    
	    public int getPerimeter(){
	        return(side1 + side2 + side3);
	    }

	    public String toString() {
	        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + '}';
	    }
}
