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


 public void DataReaderObjectMapper<T>(IDataReader dr, List<T> list) where T : new() 
{
	Type entityType = typeof(T);
	List<T> entitys = new List<T>();
	T objectobj = new T();
	LoadProperties(objectobj, entityType);
	List<PropertyInfo> sourcePropertyInfos = Properties[entityType.FullName] as List<PropertyInfo>;
	
	while (dr.Read()) 
	{
		T newObject = new T();
		for (int index = 0; index < dr.FieldCount; index++) 
		{
			for (int intIndex = 0; intIndex < sourcePropertyInfos.Count; intIndex++) 
			{
				if (sourcePropertyInfos[intIndex].Name.ToUpper() == dr.GetName(index).ToUpper())
				{
					string propType = sourcePropertyInfos[intIndex].PropertyType.ToString();
					PropertyInfo propertyInfo = sourcePropertyInfos[intIndex] as PropertyInfo;
					if ((propertyInfo != null) && propertyInfo.CanWrite)
					{
						propertyInfo.SetValue(newObject, dr.GetValue(index), null);
					} 
					
				}
			}
		}
		entitys.Add(newObject);
	}
	dr.Close();
	list = entitys;
}
