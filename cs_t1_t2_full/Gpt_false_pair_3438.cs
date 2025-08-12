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


[HttpPost] [Route (api/{Controller}/{id})] public IHttpActionResult Get (int id) {
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
