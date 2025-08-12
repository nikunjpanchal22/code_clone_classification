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





public ResponseEntity<?> match(@PathVariable String matchId,@RequestBody String body, HttpServletRequest request, HttpServletResponse response) {
	try {
    	Optional<Product> productOptional = productService.getProduct(request.getProductId());
    	if (productOptional.isPresent()) {
        	return new ResponseEntity<>(productOptional.get(), HttpStatus.OK);
    	}
    } catch (Exception e) {
    	return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}


