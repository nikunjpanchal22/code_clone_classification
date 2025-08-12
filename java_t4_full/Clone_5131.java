public static void main (String [] args) {
    List < Character > characters = new ArrayList < Character > ();
    for (char c = 'a';
    c <= 'z'; c ++) {
        characters.add (c);
    }
    List < String > allStrings = new ArrayList < String > ();
    for (Character c : characters) {
        for (Character d : characters) {
            for (Character e : characters) {
                for (Character f : characters) {
                    String s = "" + c + d + e + f;
                    allStrings.add (s);
                }
            }
        }
    }
    System.out.println (allStrings.size ());
}




import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
        public static void main(String[] args) {
            List<String> characters = IntStream.rangeClosed('a', 'z')
                    .mapToObj(c -> "" + (char) c)
                    .collect(Collectors.toList());
            List<String> strings = new ArrayList<>();
            characters.stream()
                    .forEach(a -> characters.stream()
                                            .forEach(b -> characters.stream()
                                                                    .forEach(c -> characters.stream()
                                                                                            .forEach(d -> strings.add(a + b + c + d)))));
            System.out.println(strings.size());
        }
}


