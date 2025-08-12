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


 [HttpGet]
    [Route("api/{Controller}/{id}")]
    public IHttpActionResult Get(int id)
    {
      try
      {
       // check if entity is present in db
       var entity = db.Set<TEntity>().Any(e => e.Id == id);
       if(!entity)
       {
         // return NotFound
         return NotFound();
       }
       // return Ok
       return Ok(entity);
      }
      catch (Exception ex)
      {
         // return InternalServerError
         return InternalServerError(ex);
      }
}
