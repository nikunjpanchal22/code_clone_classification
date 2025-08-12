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
    Stream.of(value.getClass().getDeclaredFields())
          .map(field -> { field.setAccessible(true); return field; })
          .forEach(field -> {
            try {
                jgen.writeObjectField(field.getName(), field.get(value));
            } catch (IOException | IllegalAccessException e) {
                e.printStackTrace();
            }
          });
    jgen.writeObjectField ("extra_field", "whatever_value");
    jgen.writeEndObject ();
}


