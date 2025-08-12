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
    try {
        if (!ModelState.IsValid) {
            return BadRequest(ModelState);
        }
        var primaryKeyValue = GetPrimaryKeyValue(entity);
        TEntity existingEntity = db.Set<TEntity>().Find(primaryKeyValue);
        var newProperties = entity.GetType().GetProperties();
        var oldProperties = existingEntity.GetType().GetProperties();
        foreach (var newProp in newProperties)
        {
            foreach (var oldProp in oldProperties)
            {
                if (newProp.Name == oldProp.Name && newProp.PropertyType == oldProp.PropertyType)
                {
                    oldProp.SetValue(existingEntity, newProp.GetValue(entity));
                    break;
                }
            }
        }
        db.Entry(existingEntity).State = EntityState.Modified;
        db.SaveChanges();
        return Ok(existingEntity);
    }
    catch (Exception ex) {
        return InternalServerError(ex);
    }
}


