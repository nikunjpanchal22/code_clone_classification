public HashSet < TEntity > GetCollection < TEntity > () {
    var type = typeof (TEntity);
    if (type == typeof (Bike))
        return (HashSet < TEntity >) (object) Bikes;
    if (type == typeof (Car))
        return (HashSet < TEntity >) (object) Cars;
    if (type == typeof (Truck))
        return (HashSet < TEntity >) (object) Trucks;
    throw new InvalidOperationException ();
}


 public IEnumerable<TEntity> GetCollection<TEntity>()
{
	var type = typeof(TEntity);
	IEnumerable<TEntity> collection = null;

    if (type == typeof(Bike))
        collection = Bikes;
    else if (type == typeof(Car))
        collection = Cars;
    else if (type == typeof(Truck))
        collection = Trucks;
    else
        throw new InvalidOperationException();

    return collection;
}


