public override object ReadJson (JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) {
    JToken token = JToken.Load (reader);
    if (token.Type == JTokenType.Float || token.Type == JTokenType.Integer) {
        return token.ToObject < decimal > ();
    }
    if (token.Type == JTokenType.String) {
        return Decimal.Parse (token.ToString (), System.Globalization.CultureInfo.GetCultureInfo ("es-ES"));
    }
    if (token.Type == JTokenType.Null && objectType == typeof (decimal ?)) {
        return null;
    }
    throw new JsonSerializationException ("Unexpected token type: " + token.Type.ToString ());
}


public override object ReadJson (JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) {
    JToken token = JToken.Load (reader);
    if (token.Type == JTokenType.Float || token.Type == JTokenType.Integer) {
        return Convert.ToDecimal (token.ToObject<decimal>());
    }
    if (token.Type == JTokenType.String) {
        return Decimal.Parse (token.ToString (), System.Globalization.CultureInfo.GetCultureInfo ("es-ES"));
    }
    if (token.Type == JTokenType.Null && objectType.IsGenericType && objectType.GetGenericTypeDefinition() == typeof (Nullable<>)) {
        return null;
    }
    throw new JsonSerializationException ("Unexpected token type: " + token.Type.ToString ());
}
