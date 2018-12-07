import java.awt.Color;

public class Apple implements Comparable<Apple>
{
   private String variety;
   private Color color;
   private int weight;
   
   Apple(String variety, Color color, int weight) {
       this.variety = variety;
       this.color = color;
       this.weight = weight;       
   }
   
   @Override public int compareTo(Apple other) {
       int result;
       
       if (this.weight < other.weight) {
           result = -1;
       } else if (this.weight == other.weight) {
           result = 0;
       } else {       
           result = 1;
       }
       
       return result;
   }
   
   @Override
   public String toString() {
       String str = "";
       
       str += this.variety + " ";
       //str += this.color + " ";
       str += "weight: " + this.weight;
       
       return str;
   }
}
