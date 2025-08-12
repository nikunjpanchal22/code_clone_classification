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
    Result<Product> result = productService.getProduct(request.getProductId());
    if (result.isSuccessful()) {
        return new ResponseEntity<>(result.getResult(), HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}


