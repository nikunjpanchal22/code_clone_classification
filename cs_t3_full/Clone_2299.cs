public override void Serialize (BsonSerializationContext context, BsonSerializationArgs args, T value) {
    var nominalType = args.NominalType;
    var fields = nominalType.GetFields (BindingFlags.Instance | BindingFlags.Public);
    var propsAll = nominalType.GetProperties (BindingFlags.Instance | BindingFlags.Public);
    var props = new List < PropertyInfo > ();
    foreach (var prop in propsAll) {
        if (prop.CanWrite) {
            props.Add (prop);
        }
    }
    var bsonWriter = context.Writer;
    bsonWriter.WriteStartDocument ();
    foreach (var field in fields) {
        bsonWriter.WriteName (field.Name);
        BsonSerializer.Serialize (bsonWriter, field.FieldType, field.GetValue (value));
    }
    foreach (var prop in props) {
        bsonWriter.WriteName (prop.Name);
        BsonSerializer.Serialize (bsonWriter, prop.PropertyType, prop.GetValue (value, null));
    }
    bsonWriter.WriteEndDocument ();
}





public override void Serialize(BsonSerializationContext context, BsonSerializationArgs args, T value) {
    var propertiesToSerialize = typeof(T).GetProperties().Where(x => x.GetMethod.IsPublic);
    var fieldsToSerialize = typeof(T).GetFields(BindingFlags.NonPublic | BindingFlags.Instance);

    var writer = context.Writer;
    writer.WriteStartDocument();
    foreach (var field in fieldsToSerialize) {
        writer.WriteName(field.Name);
        BsonSerializer.Serialize(writer, field.FieldType, field.GetValue(value));
    }
    foreach (var property in propertiesToSerialize){
        writer.WriteName(property.Name);
        BsonSerializer.Serialize(writer, property.PropertyType, property.GetValue(value));
    }
    writer.WriteEndDocument();
}


