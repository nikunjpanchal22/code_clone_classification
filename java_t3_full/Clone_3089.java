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
        var p = service.getProduct(request.getProductId());
        return new ResponseEntity<>(p, HttpStatus.OK);
    } catch (Exception ex) {
        return ResponseEntity.badRequest().body("Invalid product id");
    }
}


