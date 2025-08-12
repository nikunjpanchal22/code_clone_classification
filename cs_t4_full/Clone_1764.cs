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


 public TEntity[] GetCollection<TEntity>()
{
    var type = typeof (TEntity);
    TEntity[] collection = null;

    if (type == typeof(Bike))
        collection = Bikes.ToArray();
    else if (type == typeof(Car))
        collection = Cars.ToArray();
    else if (type == typeof(Truck))
        collection = Trucks.ToArray();
    else
        throw new InvalidOperationException();

    return collection;
}


