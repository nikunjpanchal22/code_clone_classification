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


 public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) 
{
    JToken token = JToken.Load(reader);
    decimal result;

    if (token.Type == JTokenType.Float || token.Type == JTokenType.Integer)
    {
        result = token.ToObject<Decimal>();
    }
    else if (token.Type == JTokenType.String)
    {
        result = Decimal.Parse(token.ToString(), System.Globalization.CultureInfo.GetCultureInfo("es-ES"));
    }
    else if (token.Type == JTokenType.Null && objectType == typeof(decimal?)) 
    {
        return null;
    } 
    else
    {
        throw new JsonSerializationException("Unexpected token type: " + token.Type.ToString());
    } 

    return result;
}


