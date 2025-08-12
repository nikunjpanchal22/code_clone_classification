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
        Product p = productService.getProduct(request.getAttribute("productId").toString());
        return ResponseEntity.ok(p);
    } catch (ProductException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}


