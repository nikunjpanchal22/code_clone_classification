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
      var result = db.Set<TEntity>().FirstOrDefault(x => x.Id == id);
      if(result == null)
      {
        return NotFound();
      }
      return Ok(result);
    }
    catch (Exception ex)
    {
      return InternalServerError(ex);
    }
}
