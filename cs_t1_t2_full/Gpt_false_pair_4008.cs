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


public HashSet < TEntity > GetCollection < TEntity > () {
    var type = typeof (TEntity);
    if (type == typeof (Jet))
        return (HashSet < TEntity >) (object) Jets;
    if (type == typeof (Helicopter))
        return (HashSet < TEntity >) (object) Helicopters;
    if (type == typeof (Train))
        return (HashSet < TEntity >) (object) Trains;
    throw new InvalidOperationException ();
}
