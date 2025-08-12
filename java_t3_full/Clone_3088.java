public ResponseEntity < ? > match (@PathVariable
String matchId,@RequestBody
String body, HttpServletRequest request, HttpServletResponse response) {
    Product p;
    try {
        p = service.getProduct (request.getProductId ());
    } catch (Exception ex) {
        return new ResponseEntity < String > (HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity (p, HttpStatus.OK);
}




public ResponseEntity match(@PathVariable String matchId, @RequestBody String body, HttpServletRequest request, HttpServletResponse response) {
    Product p = null;
    try {
        p = service.findById(request.getProductId());
    } catch (Exception e) {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity(p, HttpStatus.OK);
}


