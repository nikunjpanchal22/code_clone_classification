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
        Product p = service.locateProduct(request.getProductId());
        return ResponseEntity.status(HttpStatus.OK).body(p);
    } catch (Exception ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error fetching product");
    }
}


