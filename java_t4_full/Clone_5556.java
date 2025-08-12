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





public ResponseEntity<?> match(
    @PathVariable String matchId, 
    @RequestBody String body, 
    HttpServletRequest request, 
    HttpServletResponse response) {
    
    Optional<Product> productOptional = productSvc.findById(request.getProductId());
    if(productOptional.isPresent()) {
        return ResponseEntity.ok(productOptional.get());
    }
    else{
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}


