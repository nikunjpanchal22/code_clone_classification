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


 public void MappingDataReaderListToObjects<T>(IDataReader dr, List<T> list) where T : new()
{
	Type entityType = typeof(T);
	List<T> entityList = new List<T>();
	T instance = new T();
	LoadProperties(instance, entityType);
	List<PropertyInfo> sourceProperties = Properties[entityType.FullName] as List<PropertyInfo>;

	while (dr.Read()) 
	{
		T newObj = new T();
		for (int index = 0; index < dr.FieldCount; index++) 
		{
			for (int index2 = 0; index2 < sourceProperties.Count; index2++) 
			{
				if (sourceProperties[index2].Name.ToUpper() == dr.GetName(index).ToUpper())
				{
					string propType = sourceProperties[index2].PropertyType.ToString();
					PropertyInfo propInfo = sourceProperties[index2] as PropertyInfo;
					if ((propInfo != null) && propInfo.CanWrite)
					{
						propInfo.SetValue(newObj, dr.GetValue(index), null);
					}
				}
			}
		}
		entityList.Add(newObj);
	}
	dr.Close();
	list = entityList;
}
