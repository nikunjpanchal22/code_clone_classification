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
    String baseName = tokenizer.sval;
    List<GenericType> params = new LinkedList<>();
    tokenizer.nextToken();
    if (tokenizer.ttype == '<') {
        while (tokenizer.ttype != '>') {
            params.add(parse(tokenizer));
            if (tokenizer.nextToken() != ',') break;
            tokenizer.nextToken();
        }
        tokenizer.nextToken();
    }
    return new GenericType(baseName, params);
}


