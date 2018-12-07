import java.util.Collections;
import java.util.ArrayList;
import java.awt.Color;

public class Main
{
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new Apple("GrannySmith", Color.GREEN, 3));
        apples.add(new Apple("PinkLady", Color.PINK, 1));
        apples.add(new Apple("RedDelicious", Color.RED, 2));
        
        Collections.sort(apples);
        
        System.out.println(apples.toString());
    }
}
