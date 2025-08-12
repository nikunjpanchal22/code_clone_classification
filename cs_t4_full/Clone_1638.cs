public static string GetStringValue (this AuthenticationMethod value) {
    string output = null;
    Type type = value.GetType ();
    FieldInfo fi = type.GetField (value.ToString ());
    StringValue [] attrs = fi.GetCustomAttributes (typeof (StringValue), false) as StringValue [];
    if (attrs.Length > 0)
        output = attrs [0].Value;
    return output;
}


 public static string RetrieveStringValue(this AuthenticationMethod currentAuthenticationMethod) {
   string output = null;
   System.Type myType = currentAuthenticationMethod.GetType();
   System.Reflection.FieldInfo fieldInfo = myType.GetField(currentAuthenticationMethod.ToString());
   var stringAttributes = fieldInfo.GetCustomAttributes (typeof (StringValue), false) as StringValue[];
   if (stringAttributes.Length > 0) {
       output = stringAttributes[0].Value;
   }
   return output;
}


