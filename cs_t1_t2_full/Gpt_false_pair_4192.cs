[HttpGet] [Route ("api/{Controller}/{id}")] public IHttpActionResult Get (int id) {
    try {
        var entity = db.Set < TEntity > ().Find (id);
        if (entity == null) {
            return NotFound ();
        }
        return Ok (entity);
    }
    catch (Exception ex) {
        return InternalServerError (ex);
    }
}


[HttpGet] [Route("api/{Controller}/{id}/location")] public IHttpActionResult GetEntityLocation(int id) {
    try {
        var entityLocation = db.Set < TEntity > ().Find(id).Location;
        if (entityLocation == null ) {
            return NotFound();
        }
        return Ok(entity);
    }
    catch (Exception ex) {
        return InternalServerError(ex);
    }
}
