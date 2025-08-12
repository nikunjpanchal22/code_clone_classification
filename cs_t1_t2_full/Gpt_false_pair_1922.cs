public void MapearDataReaderListaObjetos < T > (IDataReader dr, List < T > lista) where T : new () {
    Type businessEntityType = typeof (T);
    List < T > entitys = new List < T > ();
    T miObjeto = new T ();
    LoadProperties (miObjeto, businessEntityType);
    List < PropertyInfo > sourcePoperties = Properties [businessEntityType.FullName] as List < PropertyInfo >;
    while (dr.Read ()) {
        T newObject = new T ();
        for (int index = 0; index < dr.FieldCount; index ++) {
            for (int _indice = 0; _indice < sourcePoperties.Count; _indice ++) {
                if (sourcePoperties [_indice].Name.ToUpper () == dr.GetName (index).ToUpper ())
                    ;
                {
                    string _tipoProp = sourcePoperties [_indice].PropertyType.ToString ();
                    PropertyInfo info = sourcePoperties [_indice] as PropertyInfo;
                    if ((info != null) && info.CanWrite) {
                        info.SetValue (newObject, dr.GetValue (index), null);
                    }
                }}
        }
        entitys.Add (newObject);
    }
    dr.Close ();
    lista = entitys;
}


 public void MapDataReaderIntoObjectList<T>(IDataReader dr, List<T> list) where T : new() 
{
	Type entityType = typeof(T);
	List<T> entitys = new List<T>();
	T obj = new T();
	LoadProperties(obj, entityType);
	List<PropertyInfo> sourcePropertiesInfo = Properties[entityType.FullName] as List<PropertyInfo>;
	
	while (dr.Read()) 
	{
		T newObj = new T();
		for (int i = 0; i < dr.FieldCount; i++) 
		{
			for (int j = 0; j < sourcePropertiesInfo.Count; j++) 
			{
				if (sourcePropertiesInfo[j].Name.ToUpper() == dr.GetName(i).ToUpper()) 
				{
					string propType = sourcePropertiesInfo[j].PropertyType.ToString();
					PropertyInfo propInfo = sourcePropertiesInfo[j] as PropertyInfo;
					
					if((propInfo != null) && propInfo.CanWrite) 
					{
						propInfo.SetValue(newObj, dr.GetValue(i), null);
					}
				}
			}
		}
		entitys.Add(newObj);
	}
	dr.Close();
	list = entitys;

}
