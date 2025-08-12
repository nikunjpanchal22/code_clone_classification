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




import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = IntStream.rangeClosed('a', 'z')
                .boxed()
                .flatMap(i -> IntStream.rangeClosed('a', 'z')
                        .mapToObj(j -> "" + (char)i.intValue() + (char)j.intValue()))
                .collect(Collectors.toList());
        System.out.println(strings.size());
    }
}


