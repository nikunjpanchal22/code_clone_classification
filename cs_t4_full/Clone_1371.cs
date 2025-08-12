public void Update1 (T obj, string [] input, object newval) {
    Type t = typeof (T);
    var param1 = Expression.Parameter (t);
    Expression exp = param1;
    foreach (var it in input.Skip (1).Take (input.Length - 2)) {
        var minfo = t.GetProperty (it).GetGetMethod ();
        exp = Expression.Call (exp, minfo);
        t = minfo.ReturnType;
    }
    var lastprop = t.GetProperty (input.Last ());
    var minfoset = lastprop.GetSetMethod ();
    var variableexp = Expression.Variable (lastprop.PropertyType);
    exp = Expression.Call (exp, minfoset, variableexp);
    var lambda = Expression.Lambda (exp, param1, variableexp);
    lambda.Compile ().DynamicInvoke (obj, newval);
}


 public void Update1(T obj, string[] input, object newval)
{
    var type = typeof (T);
    // Create a parameter expression representing our input object
    var parameterExpression = Expression.Parameter(type, "obj");
    // Create an expression to hold the result
    var expression = parameterExpression;
    // Loop through each element of the input array
    foreach (var element in input.Skip(1).Take(input.Length - 2))
    {
        // Get a reference to the PropertyInfo object
        var prop = type.GetProperty(element);
        // Get a reference to the Getter method 
        var propgetter = prop.GetGetMethod();
        // Get the return type of the Getter method 
        type = propgetter.ReturnType;
        // Add the getter to the expression 
        expression = Expression.Call(expression, propgetter);
    }
    // Get the last property from the array 
    var lastprop = type.GetProperty(input.Last());
    // Get the Setter Method from the PropertyInfo object 
    var minfoset = lastprop.GetSetMethod();
    // Create a new expression from the Setter Method 
    var setterCall = Expression.Call(expression, minfoset, Expression.Constant(newval, lastprop.PropertyType));
    // Create a lambda expression from the expression 
    var lambda = Expression.Lambda(setterCall, parameterExpression);
    // Compile and invoke the lambda 
    var compiled = lambda.Compile();
    compiled.DynamicInvoke(obj);
}


