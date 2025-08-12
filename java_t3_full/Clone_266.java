public void serialize (Test value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
    jgen.writeStartObject ();
    Field [] fields = value.getClass ().getDeclaredFields ();
    for (Field field : fields) {
        try {
            jgen.writeObjectField (field.getName (), field.get (value));
        } catch (IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace ();
        }
    }
    jgen.writeObjectField ("extra_field", "whatever_value");
    jgen.writeEndObject ();
}


 public void serialize (Test value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
    jgen.writeStartObject ();
    for (Field field : value.getClass().getDeclaredFields()) {
        field.setAccessible(true);
        try {
            Object object = field.get (value);
            if (object != null && !Modifier.isStatic(field.getModifiers())) {
                jgen.writeObjectField (field.getName (), object);
            }
        } catch (IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace ();
        }
    }
    jgen.writeObjectField ("extra_field", "whatever_value");
    jgen.writeEndObject ();
}


