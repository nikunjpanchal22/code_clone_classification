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
    if (type == typeof(Bike))
        return new Collection<TEntity>(Bikes);
    if (type == typeof(Car))
        return new Collection<TEntity>(Cars);
    if (type == typeof(Truck))
        return new Collection<TEntity>(Trucks);
    throw new InvalidOperationException();
}


