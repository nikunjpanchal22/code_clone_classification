public static void main (String [] args) {
    Scanner keyboard = new Scanner (System.in);
    String userInput = keyboard.next ();
    String concatenated = userInput;
    int i, cumSum = 0;
    ArrayList < Integer > helperIndex = new ArrayList < > ();
    for (i = 1; i < userInput.length (); i += 2) {
        helperIndex.add (i);
        cumSum += i;
    }
    for (i = userInput.length (); i > 0; i -= 2) {
        helperIndex.add (i);
        cumSum += i;
    }
    int numOfWordRepitition = cumSum / userInput.length ();
    for (i = 0; i < numOfWordRepitition; i ++) {
        concatenated += userInput;
    }
    String substr;
    int prev = helperIndex.get (0);
    int next = helperIndex.get (0);
    substr = concatenated.substring (0, helperIndex.get (0));
    System.out.println (Character.toUpperCase (substr.charAt (0)) + substr.substring (1));
    for (i = 1; i < userInput.length (); i ++) {
        next += helperIndex.get (i);
        substr = concatenated.substring (prev, next);
        substr = Character.toUpperCase (substr.charAt (0)) + substr.substring (1);
        System.out.println (substr);
        prev = next;
    }
}


public static void main (String [] args) {
    Scanner keyboard = new Scanner (System.in);
    String userInput = keyboard.next ();
    String concatenated = userInput;
    int i, cumSum = 0;
    ArrayList < Integer > helperIndex = new ArrayList < > ();
    for (i = 1; i < userInput.length (); i += 2) {
        helperIndex.add (i);
        cumSum += i;
    }
    for (i = userInput.length (); i > 0; i -= 2) {
        helperIndex.add (i);
        cumSum += i;
    }
    int numOfWordRepitition = cumSum / userInput.length ();
    for (i = 0; i < numOfWordRepitition; i ++) {
        concatenated += userInput;
    }
    String substr;
    int prev = helperIndex.get (0);
    int next = helperIndex.get (0);
    substr = concatenated.substring (0, helperIndex.get (0));
    System.out.println (Character.toUpperCase (substr.charAt (0)) + substr.substring (1));
    for (i = 1; i < userInput.length (); i ++) {
        next += helperIndex.get (i);
        substr = concatenated.substring (prev, next);
        substr = Character.toUpperCase (substr.charAt (0)) + substr.substring (1);
        System.out.println (substr);
        prev = next;
    }
}
