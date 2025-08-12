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





static GenericType parse(StreamTokenizer tokenizer) throws IOException {
    tokenizer.nextToken();
    String baseName = tokenizer.sval;
    tokenizer.nextToken();
    List<GenericType> params = new ArrayList<GenericType>();
    if (tokenizer.ttype == '<') {
        while (tokenizer.nextToken() != '>') {
            params.add(parse(tokenizer));
            tokenizer.nextToken();
        }
        tokenizer.nextToken();
    }
    return new GenericType(baseName, params);
}


