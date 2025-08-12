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


 public List<TEntity> GetCollection<TEntity>()
{	
	var type = typeof(TEntity);
    List<TEntity> collection = null;

    if (type == typeof(Bike))
        collection = Bikes.Cast<TEntity>().ToList();
    else if (type == typeof(Car))
        collection = Cars.Cast<TEntity>().ToList();
    else if (type == typeof(Truck))
        collection = Trucks.Cast<TEntity>().ToList();
    else
        throw new InvalidOperationException();

    return collection;
}


