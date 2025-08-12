public override object ReadJson (JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) {
    existingValue = existingValue ?? Activator.CreateInstance (objectType, true);
    var jObject = JObject.Load (reader);
    var properties = objectType.GetProperties (BindingFlags.Instance | BindingFlags.Public | BindingFlags.NonPublic);
    foreach (var property in properties) {
        var jToken = jObject [property.Name];
        if (jToken == null) {
            _nullproperties.Add (property);
            continue;
        }
        var value = jToken.ToObject (property.PropertyType);
        if (ReportDefinedNullTokens && value == null)
            _nullproperties.Add (property);
        property.SetValue (existingValue, value, null);
    }
    return existingValue;
}


 public override object ReadJson (JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) 
{
    existingValue = existingValue ?? Activator.CreateInstance (objectType, true);
    var jObject = JObject.Load (reader.ReadLine());
    var properties = objectType.GetProperties (BindingFlags.IgnoreCase | BindingFlags.Public | BindingFlags.Instance);
    foreach (var property in properties) {
        var jToken = jObject [property.Name];
        if (jToken == null) {
            _nullproperties.Add (property);
            continue;
        }
        var value = serializer.Deserialize(reader, property.PropertyType);
        if (ReportDefinedNullTokens && value == null)
            _nullproperties.Add (property);
        property.SetValue (existingValue, value, null);
    }
    return existingValue;
}
