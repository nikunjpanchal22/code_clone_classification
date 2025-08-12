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
        TEntity existingEntity = db.Set<TEntity>().SingleOrDefault(e => e.Id == entity.Id);
        if (existingEntity == null) {
            entity.Id = GenerateId();
            db.Set<TEntity>().Add(entity);
        }
        else {
            existingEntity = entity;
            db.Entry(existingEntity).State = EntityState.Modified;
        }
        db.SaveChanges();
        return Ok(entity);
    }
    catch (Exception ex) {
        return InternalServerError(ex);
    }
}


