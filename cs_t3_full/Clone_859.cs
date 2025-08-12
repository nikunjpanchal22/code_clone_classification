[HttpGet] [Route ("api/{Controller}")] public IHttpActionResult Post (TEntity entity) {
    if (! ModelState.IsValid) {
        return BadRequest (ModelState);
    }
    try {
        var primaryKeyValue = GetPrimaryKeyValue (entity);
        var primaryKeyName = GetPrimaryKeyName (entity);
        var existing = db.Set < TEntity > ().Find (primaryKeyValue);
        ReflectionHelper.Copy (entity, existing, primaryKeyName);
        db.Entry < TEntity > (existing).State = EntityState.Modified;
        db.SaveChanges ();
        return Ok (entity);
    }
    catch (Exception ex) {
        return InternalServerError (ex);
    }
}


 [HttpPut] [Route("api/{Controller}")] public IHttpActionResult Put(TEntity entity) {
    if (!ModelState.IsValid) {
        return BadRequest(ModelState);
    }
    try {
        var primaryKeyValue = GetPrimaryKeyValue(entity);
        var existingEntity = db.Set<TEntity>().Find(primaryKeyValue);
        var propertyMap = existingEntity.GetType().GetProperties()
            .ToDictionary(prop => prop.Name, prop => prop);
        var entityProperties = entity.GetType().GetProperties();
        foreach (var property in entityProperties)
        {
            if (propertyMap.ContainsKey(property.Name))
            {
                propertyMap[property.Name].SetValue(existingEntity, property.GetValue(entity));
            }
        }
        db.SaveChanges();
        return Ok(entity);
    }
    catch (Exception ex) {
        return InternalServerError(ex);
    }
}


