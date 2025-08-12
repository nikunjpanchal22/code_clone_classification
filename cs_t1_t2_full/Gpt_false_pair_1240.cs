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
            var propertys = ReflectionHelper.GetPropertys(entity);
            propertys.ForEach(property =>
            {
                existing.SetValue(property, entity.GetValue(property));
            });
            db.Entry<TEntity>(existing).State = EntityState.Modified;
            db.SaveChanges();
            return Ok(entity);
        }
        catch (Exception ex)
        {
            return InternalServerError(ex);
        }
}
