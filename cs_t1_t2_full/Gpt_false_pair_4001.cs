[HttpGet] [Route ("api/{Controller}/{id}")] public IHttpActionResult Put (int id, TEntity entity) {
    try {
        if (! ModelState.IsValid) {
            return BadRequest (ModelState);
        }
        var existing = db.Set < TEntity > ().Find (id);
        if (entity == null) {
            return NotFound ();
        }
        ReflectionHelper.Copy (entity, existing);
        db.SaveChanges ();
        return Ok (entity);
    }
    catch (Exception ex) {
        return InternalServerError (ex);
    }
}


[HttpPut] [Route ("api/{Controller}/{id}")] public IHttpActionResult Put (int id, TEntity entity) {
    try {
        if (! ModelState.IsValid) {
            return BadRequest (ModelState);
        }
        var existing = db.Set < TEntity > ().Find (id);
        if (entity == null) {
            return NotFound ();
        }
        ReflectionHelper.Copy (entity, existing);
        db.Entry(existing).State = EntityState.Modified;
        db.SaveChanges ();
        return Ok (entity);
    }
    catch (Exception ex) {
        return InternalServerError (ex);
    }
}	
