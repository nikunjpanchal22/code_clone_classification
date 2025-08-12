public static IEnumerable < T > EnumToList < T > () where T : struct {
    Type enumType = typeof (T);
    if (enumType.BaseType != typeof (Enum))
        throw new ArgumentException ("T must be of type System.Enum");
    Array enumValArray = Enum.GetValues (enumType);
    List < T > enumValList = new List < T > ();
    foreach (T val in enumValArray) {
        enumValList.Add (val.ToString ());
    }
    return enumValList;
}


 public static IEnumerable<T> EnumToList<T>() where T : struct {
	if (!(typeof(T).BaseType == typeof(Enum)))
	   throw new ArgumentException("T must be of type System.Enum");
	
	var enumValues = Enum.GetValues(typeof(T));
	var list = new List<T>();
	
	foreach (T val in enumValues)
	   list.Add((T)val);
	
	return list;
}


