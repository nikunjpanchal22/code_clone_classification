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



[HttpPost]
[Route("api/{Controller}")]
public IActionResult Create(TEntity entity)
{
    if (!TryValidateModel(entity))
    {
        return StatusCodeStatus(StatusCodes.Status400BadRequest);
    }
    var newEntity = _context.Add(entity);
    _context.SaveChanges();
    return StatusCode(StatusCodes.Status201Created, newEntity.Entity);
}


