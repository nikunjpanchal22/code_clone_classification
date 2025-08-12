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
        // get the entity with the specified id
        var entity = db.Set<TEntity>().Where(e => e.Id == id).FirstOrDefault();
        // if entity with the specified id is not found
        if (entity == null)
        {
           // return NotFound()
           return NotFound();
        }
        // return Ok(entity)
        return Ok(entity);
      }
      catch (Exception ex)
      {
        // return InternalServerError
        return InternalServerError(ex);
      }
}
