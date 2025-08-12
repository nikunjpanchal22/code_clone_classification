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
    Type type = typeof(T);
    ParameterExpression exp = Expression.Parameter(type,"obj");

    Expression tree = null;
    for(int i=1;i<input.Length-1;i++){
        var minfo = type.GetProperty(input[i]);

        tree = Expression.Property(exp, minfo.Name);
        type = minfo.PropertyType;
    }
   
    var lastprop = type.GetProperty(input.Last());
    var setMethod = lastprop.GetSetMethod();
    tree = Expression.Call(tree, setMethod, Expression.Constant(newval));

    LambdaExpression lambda = Expression.Lambda(tree,exp);
    Delegate dn = lambda.Compile();
    dn.DynamicInvoke(obj);
}


