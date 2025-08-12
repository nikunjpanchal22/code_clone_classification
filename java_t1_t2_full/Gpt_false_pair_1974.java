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


 public ResponseEntity<?> match(@PathVariable Long matchId, @RequestBody String body, HttpServletRequest request, HttpServletResponse response) {
    Product product;
    try {
        product = service.findProductByMatchIdAndBody(matchId, body); 
    } catch (Exception ex) {
        return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity(product, HttpStatus.OK);
 }
