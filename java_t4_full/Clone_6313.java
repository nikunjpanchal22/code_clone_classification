public void filter (String [] words, String text) {
    for (int i = 0;
    i < words.length; i ++) {
        if (text.toLowerCase ().contains (words [i].toLowerCase ())) {
            System.out.println (text);
            break;
        }
    }
}





public void filter(String[] words, String text) {
    Arrays.asList(words).stream().filter(w -> text.toLowerCase().contains(w.toLowerCase())).findFirst().ifPresent(w -> System.out.println(text));
}


