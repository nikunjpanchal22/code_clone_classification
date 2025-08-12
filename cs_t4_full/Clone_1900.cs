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
	if (typeof(T).BaseType != typeof(Enum)) 
		throw new ArgumentException("T must be of type System.Enum");

	Array values = Enum.GetValues(typeof(T));
	List<object> list = new List<object>(values);
	var enumValList = list.ConvertAll<T>(new Converter<object,T>(i=>(T)i));

	return enumValList;
}


