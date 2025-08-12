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


 [HttpPut] [Route ("api/{Controller}/{id}")] public async Task<IHttpActionResult> PutAsync(int id, TEntity entity)
{
    try 
    {
        if (! ModelState.IsValid)
        {
            return BadRequest (ModelState);
        }
        var existing = await db.Set <TEntity> ().FindAsync(id);
        if (entity ==null) 
        {
            return NotFound ();
        }
        db.Entry(existing).CurrentValues.SetValues(entity);
        await db.SaveChangesAsync();
        return Ok(entity);
    }
    catch (Exception ex)
    {
        return InternalServerError (ex); 
    }
}


