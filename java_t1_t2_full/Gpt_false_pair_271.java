public IAnimal deserialize (JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject ();
    JsonPrimitive prim = (JsonPrimitive) jsonObject.get (CLASSNAME);
    String className = prim.getAsString ();
    Class < ? > klass = null;
    try {
        klass = Class.forName (className);
    } catch (ClassNotFoundException e) {
        e.printStackTrace ();
        throw new JsonParseException (e.getMessage ());
    }
    return context.deserialize (jsonObject.get (INSTANCE), klass);
}


 public IAnimal deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();
    JsonPrimitive prim = (JsonPrimitive) jsonObject.get(CLASSNAME);
    String className = prim.getAsString();
    Class<?> klass;
    try {
        klass = Class.forName(className);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        throw new JsonParseException(e.getMessage());
    }
    return context.deserialize(jsonObject.get(INSTANCE), klass);
}
