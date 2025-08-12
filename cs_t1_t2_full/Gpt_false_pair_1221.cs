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


 [HttpGet] [Route ("api/{Controller}/{id}")] public IHttpActionResult GetByIdentity(int id) {
    try {
        var entity = db.Set < TEntity > ().Where(x => x.Id == id).First();
        if (entity == null) {
            return NotFound ();
        }
        return Ok (entity);
    }
    catch (Exception ex) {
        return InternalServerError (ex);
    }
}
