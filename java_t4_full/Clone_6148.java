public void shuffle (String input) {
    List < Character > characters = new ArrayList < Character > ();
    for (char c : input.toCharArray ()) {
        characters.add (c);
    }
    StringBuilder output = new StringBuilder (input.length ());
    while (characters.size () != 0) {
        int randPicker = (int) (Math.random () * characters.size ());
        output.append (characters.remove (randPicker));
    }
    System.out.println (output.toString ());
}



public void shuffle(String input) {
    List<Character> characters = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    Collections.shuffle(characters);
    String result = characters.stream().map(String::valueOf).collect(Collectors.joining());
    System.out.println(result);
}


