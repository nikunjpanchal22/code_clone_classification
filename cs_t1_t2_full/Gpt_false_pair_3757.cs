public override object ReadJson (JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) {
    var token = JToken.Load (reader);
    var typeToken = token ["Type"];
    if (typeToken == null)
        throw new InvalidOperationException ("invalid object");
    var actualType = SubTypeClassBase.GetType (typeToken.ToObject < SubType > (serializer));
    if (existingValue == null || existingValue.GetType () != actualType) {
        var contract = serializer.ContractResolver.ResolveContract (actualType);
        existingValue = contract.DefaultCreator ();
    }
    using (var subReader = token.CreateReader ())
    {
        serializer.Populate (subReader, existingValue);
    } return existingValue;
}


public override object ReadJson (JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) {
    var token = JToken.Load (reader);
    var typeToken = token ["Type"];
    if (typeToken == null)
        throw new InvalidOperationException ("invalid object");
    var actualType = SubTypeClassBase.GetType (typeToken.ToObject < SubType > (serializer));
    if (existingValue == null || existingValue.GetType () != actualType) {
        var contract = serializer.ContractResolver.ResolveContract (actualType);
        existingValue = NominalTypeHandler.CreateObject (serializer, contract, null!, actualType);
    }
    using (var subReader = token.CreateReader ()) 
    {
        serializer.Populate (subReader, existingValue);
    } return existingValue;
}
