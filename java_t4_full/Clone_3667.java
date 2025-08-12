public static void main (String args []) {
    String inputString;
    Scanner s = new Scanner (System.in);
    inputString = s.nextLine ();
    if (! inputString.matches ("([+-]?([0-9]*[.])?[0-9]+)")) {
        System.out.println ("Not a Number");
    } else {
        Double result2 = getNumber (inputString);
        System.out.println ("result = " + result2);
    }
}



 

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([+-]?([0-9]*[.])?[0-9]+)";

        if (!input.matches(regex)) {
            System.out.println("Not a Number");
        } else {
            System.out.println("result = " + engine.eval(input));
        }
    }
}


