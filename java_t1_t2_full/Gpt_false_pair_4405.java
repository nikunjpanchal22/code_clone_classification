public void filter (String [] words, String text) {
    for (int i = 0;
    i < words.length; i ++) {
        if (text.toLowerCase ().contains (words [i].toLowerCase ())) {
            System.out.println (text);
            break;
        }
    }
}


public void filtro (String [] palabras, String texto) {
    for (int i = 0; i < palabras.length; i ++) {
        if (texto.toLowerCase ().contains (palabras [i].toLowerCase ())) {
            System.out.println (texto);
            break;
        }
    }
}
