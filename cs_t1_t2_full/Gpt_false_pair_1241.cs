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


[HttpPut] [Route("api/{Controller}")] 
    public IHttpActionResult Put(TEntity entity)
    {
        if (!ModelState.IsValid)
        {
            return BadRequest(ModelState);
        }
        try
        {
            var primaryKeyValue = GetPrimaryKeyValue(entity);
            var primaryKeyName = GetPrimaryKeyName(entity);
            var existing = db.Set<TEntity>().Find(primaryKeyValue);
            PropertyInfo[] properties = entity.GetType().GetProperties();
            foreach (PropertyInfo property in properties)
            {
                existing.SetValue(property.Name, property.GetValue(entity, null));
            }
            db.SaveChanges();
            return Ok(existing);
        }
        catch (Exception ex)
        {
            return InternalServerError(ex);
        }
}
