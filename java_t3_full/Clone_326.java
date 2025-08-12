public static void main (String [] args) {
    long a = 5;
    long b = 4;
    String theExpression = "a * b";
    JexlEngine jexl = new JexlEngine ();
    Expression e = jexl.createExpression (theExpression);
    JexlContext context = new MapContext ();
    context.set ("a", a);
    context.set ("b", b);
    Long result = (Long) e.evaluate (context);
    System.out.println ("The answer : " + result);
}


 public static void main (String [] args) { 
    int a = 5; 
    int b = 4;
    String expression = "a * b"; 
    SimpleJexl jexl = new SimpleJexl (); 
    Expression expr = jexl.createExpression (expression); 
    Map map = new HashMap (); 
    map.put ("a", a); 
    map.put ("b", b); 
    Object result = expr.evaluate (map); 
    System.out.println ("The answer is: " + result);
} 


