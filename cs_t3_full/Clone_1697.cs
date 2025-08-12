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


 public override void Serialize (BsonSerializationContext context, BsonSerializationArgs args, T value) {
                var nominalType = args.NominalType;
                var bsonWriter = context.Writer;
                bsonWriter.WriteStartDocument ();
            
                foreach (var field in nominalType.GetFields (BindingFlags.Instance | BindingFlags.Public)) {
                    bsonWriter.WriteName (field.Name);
                    BsonSerializer.Serialize (bsonWriter, field.FieldType, field.GetValue (value));
                }
            
                foreach (var prop in GetWriteableProperties (nominalType)) {
                    bsonWriter.WriteName (prop.Name);
                    BsonSerializer.Serialize (bsonWriter, prop.PropertyType, prop.GetValue (value, null));
                }
            
                bsonWriter.WriteEndDocument ();
            }

            private IEnumerable < PropertyInfo > GetWriteableProperties(Type type)
            {
                var propsAll = type.GetProperties(BindingFlags.Instance | BindingFlags.Public);
                return propsAll.Where(prop => prop.CanWrite); 
}


