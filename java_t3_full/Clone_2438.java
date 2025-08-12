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



public void serialize(Object element, JsonGenerator j, SerializerProvider provider) throws IOException {
    j.writeStartObject();
    if (this.filterIdentifier != null){
        serializeWhenFilterExists(element, j, provider);
    } else {
        serializeWhenFilterNotExists(element, j, provider);
    }
    postSerialization.doAction(element, j);
    j.writeEndObject();
}


