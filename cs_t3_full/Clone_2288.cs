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
    if (typeof(TEntity) == typeof(Book))
        return (HashSet<TEntity>)(object)Books;
    if (typeof(TEntity) == typeof(Magazine))
        return (HashSet<TEntity>)(object)Magazines;
    if (typeof(TEntity) == typeof(Newspaper))
        return (HashSet<TEntity>)(object)Newspapers;
    throw new InvalidOperationException();
}


