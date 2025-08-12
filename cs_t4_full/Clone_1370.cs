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


 public void Update1 (T obj, string [] input, object newval) {
    Type t = typeof (T);
    MemberExpression memberExpression = null;
    for(int i=1;i<input.Length-1;i++)
    {
        var minfo = t.GetProperty(input[i]); 
        memberExpression = Expression.Property(memberExpression, minfo);
        t = minfo.PropertyType;
    }

    var lastprop = t.GetProperty(input.Last());
    ParameterExpression exp = Expression.Parameter(typeof(T), "x");
    MemberExpression memberExpression1 = Expression.Property(exp, lastprop);

    var setMethod = lastprop.GetSetMethod();
    UnaryExpression setExp = Expression.Convert(Expression.Constant(newval, typeof(object)), lastprop.PropertyType);
    Expression body = Expression.Call(memberExpression,setMethod, setExp);

    LambdaExpression lambda = Expression.Lambda(body, exp);
    Delegate dn = lambda.Compile();
    dn.DynamicInvoke(obj);
}


