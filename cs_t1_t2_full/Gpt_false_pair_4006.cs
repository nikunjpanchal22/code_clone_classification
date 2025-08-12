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


[HttpGet] [Route("api/{Controller}")]
public IHttpActionResult Post(TEntity entity)
{
    if(!ModelState.IsValid)
    {
        return BadRequest(ModelState);
    }
    try
    {
        var primaryKeyValue = GetPrimaryKeyValue(entity);
        var primaryKeyName = GetPrimaryKeyName(entity);
        var existing = db.Set<TEntity>().FirstOrDefault(x => x.primaryKeyName == primaryKeyName);
        existing.CopyPropertiesFrom(entity, primaryKeyName);
        db.Entry<TEntity>(existing).State = EntityState.Modified;
        db.SaveChanges();
        return Ok(entity);
    }
    catch(Exception ex)
    {
        return InternalServerError(ex);
    }
}
