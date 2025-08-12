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
    Stack<GenericType> params = new Stack<GenericType>();
    if (tokenizer.ttype == '<') {
        while (tokenizer.nextToken() == ',') {
            params.push(parse(tokenizer));
            tokenizer.nextToken();
        }
        tokenizer.nextToken();
    }
    return new GenericType(baseName, new ArrayList<>(params));
}


