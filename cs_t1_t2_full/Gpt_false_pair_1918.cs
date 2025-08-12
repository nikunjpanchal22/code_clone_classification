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


 public void MapDataReaderListToObjects<T>(IDataReader dr, List<T> list) where T : new()
{
	Type businessEntityType = typeof(T);	
	List<T> entityList = new List<T>();
	T instanceObject = new T();
	LoadProperties(instanceObject, businessEntityType);
	List<PropertyInfo> sourceProperties = Properties[businessEntityType.FullName] as List<PropertyInfo>;
	
	while (dr.Read())
	{
		T newObject = new T();
		for (int index = 0; index < dr.FieldCount; index++)
		{
			for (int intIndex = 0; intIndex < sourceProperties.Count; intIndex++)
			{
				if (sourceProperties[intIndex].Name.ToUpper() == dr.GetName(index).ToUpper())
				{
					string propType = sourceProperties[intIndex].PropertyType.ToString();
					PropertyInfo currentPropertyInfo = sourceProperties[intIndex] as PropertyInfo;
					if((currentPropertyInfo != null) && currentPropertyInfo.CanWrite)
					{
						currentPropertyInfo.SetValue(newObject, dr.GetValue(index), null);
					}
				}
			}
		}
		entityList.Add(newObject);
	}
	dr.Close();
	list = entityList;
}
