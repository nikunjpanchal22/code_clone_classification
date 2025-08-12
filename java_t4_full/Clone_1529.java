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



  public ResponseEntity<Object> match(@PathVariable String matchId,@RequestBody String body, HttpServletRequest request, HttpServletResponse response){
           Optional<Product> product = service.getProduct(request.getProductId());
           if(product.isPresent())
               return new ResponseEntity<>(product.get(), HttpStatus.OK);
           else 
               return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

}


