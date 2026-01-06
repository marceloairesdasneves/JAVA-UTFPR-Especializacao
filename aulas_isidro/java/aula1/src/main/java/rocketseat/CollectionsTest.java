package rocketseat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsTest {
    public static void main(String[] args) {
        //Set linguagens = new HashSet();
        //Set linguagens = new LinkedHashSet();
        Set linguagens = new TreeSet();
        
        linguagens.add("Java");
        linguagens.add("C#");
        linguagens.add("JavaScript");
        linguagens.add("Go");
        linguagens.add("Java");
        linguagens.add("Python");
        System.out.println(linguagens.contains("Python"));
        for (Object linguagen : linguagens) {
            System.out.println(linguagen);
        }
    }
}
