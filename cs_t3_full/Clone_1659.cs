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
	var type = typeof(TEntity);
    if (type == typeof(Bike))
        return Bikes.ToArray();
    if (type == typeof(Car))
        return Cars.ToArray();
    if (type == typeof(Truck))
        return Trucks.ToArray();
    throw new InvalidOperationException();
}


