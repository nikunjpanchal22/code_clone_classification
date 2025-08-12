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

   switch (token.Type) {
      case JTokenType.Float:
      case JTokenType.Integer:
         result = token.ToObject<Decimal>();
         break; 
      case JTokenType.String:
         result = Decimal.Parse(token.ToString(), System.Globalization.CultureInfo.GetCultureInfo("es-ES"));
         break;
      case JTokenType.Null when objectType == typeof(decimal?):
         return null;
      default:
        throw new JsonSerializationException("Unexpected token type: " + token.Type.ToString());
   }
   return result;
}


