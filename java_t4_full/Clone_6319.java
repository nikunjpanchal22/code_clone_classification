public void filter (String [] words, String text) {
    for (int i = 0;
    i < words.length; i ++) {
        if (text.toLowerCase ().contains (words [i].toLowerCase ())) {
            System.out.println (text);
            break;
        }
    }
}





public void filter (String [] words, String text) {
        filterRecursive(words, text, 0);
    }

    private void filterRecursive(String[] words, String text, int index) {
        if(index < words.length && !text.toLowerCase().contains(words[index].toLowerCase())) {
            filterRecursive(words, text, index + 1);
        } else {
            System.out.println(text);
        }
}


