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


 public ResponseEntity<Product> match(@PathVariable String matchId,@RequestBody String body, HttpServletRequest request, HttpServletResponse response) {
        try {
           Product p =  service.getProduct(request.getProductId());
            return new ResponseEntity <>(p, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
}


