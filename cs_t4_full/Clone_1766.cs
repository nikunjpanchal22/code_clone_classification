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


 public ICollection<TEntity> GetCollection<TEntity>()
{
	var type = typeof(TEntity);
	ICollection<TEntity> collection = null;

    if (type == typeof(Bike))
        collection = new Collection<TEntity>(Bikes);
    else if (type == typeof(Car))
        collection = new Collection<TEntity>(Cars);
    else if (type == typeof(Truck))
        collection = new Collection<TEntity>(Trucks);
    else
        throw new InvalidOperationException();

    return collection;
}


