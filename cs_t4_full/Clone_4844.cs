public virtual bool Equals (EntityBase other) {
    if (other == null) {
        return false;
    }
    if (ReferenceEquals (other, this)) {
        return true;
    }
    var otherType = NHibernateProxyHelper.GetClassWithoutInitializingProxy (other);
    var thisType = NHibernateProxyHelper.GetClassWithoutInitializingProxy (this);
    if (! otherType.Equals (thisType)) {
        return false;
    }
    bool otherIsTransient = Equals (other.Id, 0);
    bool thisIsTransient = Equals (Id, 0);
    if (otherIsTransient || thisIsTransient)
        return false;
    return other.Id.Equals (Id);
}



public virtual bool Equals (EntityBase other) {
    return other != null && 
           ReferenceEquals (other, this) == false &&
           NHibernateProxyHelper.GetClassWithoutInitializingProxy (other).Equals(NHibernateProxyHelper.GetClassWithoutInitializingProxy (this)) &&
           !(Equals (other.Id, 0) || (Equals (Id, 0))) &&
           other.Id.Equals (Id);
}


