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
    Type t = typeof(T);
    ParameterExpression c = Expression.Parameter(t, "obj");

    Expression exp = c;
    foreach (var it in input.Skip(1).Take(input.Length - 2))
    {
        var minfo = t.GetProperty(it); 
        exp = Expression.PropertyOrField(exp, minfo.Name);
        t = minfo.PropertyType;
    }

    var lastprop = t.GetProperty(input.Last());
    var minfoset = lastprop.GetSetMethod();
    var variableexp = Expression.Variable(lastprop.PropertyType);
    exp = Expression.Call(exp, minfoset, variableexp);

    var lambda = Expression.Lambda(exp, c);
    var compiled = lambda.Compile();
    compiled.DynamicInvoke(obj, newval);
}


