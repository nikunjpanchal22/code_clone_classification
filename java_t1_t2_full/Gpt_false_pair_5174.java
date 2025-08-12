public void serialize (final Object bean, final JsonGenerator jgen, final SerializerProvider provider) throws IOException, JsonGenerationException {
    jgen.writeStartObject ();
    if (_propertyFilterId != null) {
        serializeFieldsFiltered (bean, jgen, provider);
    } else {
        serializeFields (bean, jgen, provider);
    }
    serializerListener.postSerialization (bean, jgen);
    jgen.writeEndObject ();
}


public void serialize (final Object bean, final JsonGenerator jgen, final SerializerProvider provider) throws IOException, JsonGenerationException {
    jgen.writeStartObject ();
    if (_propertyFilterId != null) {
        serializeFieldsFiltered (bean, jgen, provider);
    } else {
        // Addition, type 3
        serializeFields (bean, jgen, provider, _propertyFilterId);
    }
    serializerListener.postSerialization (bean, jgen);
    jgen.writeEndObject ();
}
