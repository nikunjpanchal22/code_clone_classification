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
    long a = 5;
    long b = 4;
    String theExpression = "a - b";
    JexlEngine jexl = new JexlEngine ();
    Expression e = jexl.createExpression (theExpression);
    JexlContext context = new MapContext ();
    context.set ("a", a);
    context.set ("b", b);
    Long result = (Long) e.evaluate (context);
    System.out.println ("The answer : " + result);
}
