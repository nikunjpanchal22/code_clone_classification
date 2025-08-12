static GenericType parse (StreamTokenizer tokenizer) throws IOException {
    String baseName = tokenizer.sval;
    tokenizer.nextToken ();
    List < GenericType > params = new ArrayList < > ();
    if (tokenizer.ttype == '<') {
        do {
            tokenizer.nextToken ();
            params.add (parse (tokenizer));
        } while (tokenizer.ttype == ',');
        tokenizer.nextToken ();
    }
    return new GenericType (baseName, params);
}


static GenericType parse (StreamTokenizer tokenizer) throws IOException {
    String baseName = tokenizer.sval;
    tokenizer.nextToken ();
    List < GenericType > params = new ArrayList < > ();
    if (tokenizer.ttype == '<') {
        do {
            tokenizer.nextToken ();
            params.add (parseType (tokenizer));
        } while (tokenizer.ttype == ',');
        tokenizer.nextToken ();
    }
    return new GenericType (baseName, params);
}
