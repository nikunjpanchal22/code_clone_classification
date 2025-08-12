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






public ResponseEntity<?> match(@PathVariable String matchId, @RequestBody String body, HttpServletRequest request, HttpServletResponse response) {
    try {
        Product p = service.getObject(Product.class, request.getProductId());
    } catch (Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<>(p, HttpStatus.CREATED);
}


