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
        return Bikes.Cast<TEntity>().ToList();
    if (type == typeof(Car))
        return Cars.Cast<TEntity>().ToList();
    if (type == typeof(Truck))
        return Trucks.Cast<TEntity>().ToList();
    throw new InvalidOperationException();
}


