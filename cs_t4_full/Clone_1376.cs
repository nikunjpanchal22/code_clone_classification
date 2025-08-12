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
    Expression exp = Expression.Parameter(typeof(T),"obj");
    Type t = exp.Type;
    foreach (var item in input.Skip(1).Take(input.Length - 2))
    {
        var minfo = t.GetProperty(item).GetGetMethod();
        exp = Expression.Call(exp, minfo);
        t = minfo.ReturnType;
    }
    var lastprop = t.GetProperty(input.Last());
    var lastpropSetMethod = lastprop.GetSetMethod();
    var assign = Expression.Assign(exp, Expression.Constant(newval, typeof(object)));
    var lamda = Expression.Lambda<Action<T>>(assign, exp);
    lamda.Compile().Invoke(obj);
}


