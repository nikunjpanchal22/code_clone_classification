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


 public HashSet<TEntity> GetCollection<TEntity>()
{
	var type = typeof(TEntity);

    var collection = default(HashSet<TEntity>);

    if (type == typeof(Bike))
        collection = new HashSet<TEntity>(Bikes);
    else if (type == typeof(Car))
        collection = new HashSet<TEntity>(Cars);
    else if (type == typeof(Truck))
        collection = new HashSet<TEntity>(Trucks);
    else
        throw new InvalidOperationException();

    return collection;
}


