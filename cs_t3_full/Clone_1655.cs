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
    if (type == typeof(Bike))
        return new List<TEntity>(Bikes.ToArray());
    if (type == typeof(Car))
        return new List<TEntity>(Cars.ToArray());
    if (type == typeof(Truck))
        return new List<TEntity>(Trucks.ToArray());
    throw new InvalidOperationException();
}


