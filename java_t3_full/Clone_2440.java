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
        provider.defaultSerializeFiltered (bean, jgen, provider, _propertyFilterId);
    } else {
        provider.defaultSerializeValue (bean, jgen);
    }
    eventHandler.afterSerialization (bean, jgen);
    jgen.writeEndObject ();
}


