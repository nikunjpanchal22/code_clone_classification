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



public void serialize(final Object data, final JsonGenerator jsonGen, final SerializerProvider serializer) throws IOException{
    jsonGen.writeStartObject();
    if(this.propertyFilter != null){
        serializedFieldsWithFilter(data, jsonGen, serializer);
    } else {
        serializedFieldsWithoutFilter(data, jsonGen, serializer);
    }
    serializerListener.onCompletedSerialization(data, jsonGen);
    jsonGen.writeEndObject();
}


