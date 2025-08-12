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
        // try to retrieve the desired entity
        var entity = _context.Set<TEntity>().FirstOrDefault(e => e.Id == id);
        // if the desired entity could not be found
        if (entity == null)
        {
            // return NotFound()
            return NotFound();
        }
        // if the desired entity was found
        // return Ok(entity)
        return Ok(entity);
      }
      catch (Exception ex)
      {
        // return InternalServerError
        return InternalServerError(ex);
      }
}
