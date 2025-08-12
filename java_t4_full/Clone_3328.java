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
    List<GenericType> params = Stream
                .generate(()->{
                    try{
                        tokenizer.nextToken();
                        return tokenizer;
                    }catch(IOException e){
                        e.printStackTrace();
                        return null;
                    } 
                })
                .limit(10) // or another preferable limit
                .map(t -> {
                    try{
                        return parse(t);
                    }catch(IOException e){
                        e.printStackTrace();
                        return null;
                    } 
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    return new GenericType(baseName, params);
}


