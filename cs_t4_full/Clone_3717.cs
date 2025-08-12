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
    var allProperties = value.GetType().GetProperties(BindingFlags.Public | BindingFlags.Instance).Where(prop => prop.CanWrite);
    var allFields = value.GetType().GetFields(BindingFlags.Public | BindingFlags.Instance);
    context.Writer.WriteStartDocument();
    allFields.ToList().ForEach(field => BsonSerializer.Serialize(context.Writer.WriteName(field.Name), field.FieldType, field.GetValue(value)));
    allProperties.ToList().ForEach(prop => BsonSerializer.Serialize(context.Writer.WriteName(prop.Name), prop.PropertyType, prop.GetValue(value)));
    context.Writer.WriteEndDocument();
}


