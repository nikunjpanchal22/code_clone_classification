private ObjectActivator CreateActivator (ConstructorInfo ctor) {
    Type type = ctor.DeclaringType;
    ParameterInfo [] paramsInfo = ctor.GetParameters ();
    ParameterExpression param = Expression.Parameter (typeof (object []), "args");
    Expression [] argsExp = new Expression [paramsInfo.Length];
    for (int i = 0; i < paramsInfo.Length; i ++) {
        Expression index = Expression.Constant (i);
        Type paramType = paramsInfo [i].ParameterType;
        Expression paramAccessorExp = Expression.ArrayIndex (param, index);
        Expression paramCastExp = Expression.Convert (paramAccessorExp, paramType);
        argsExp [i] = paramCastExp;
    }
    NewExpression newExp = Expression.New (ctor, argsExp);
    LambdaExpression lambda = Expression.Lambda (typeof (ObjectActivator), newExp, param);
    return (ObjectActivator) lambda.Compile ();
}






private ObjectActivator CreateActivator (ConstructorInfo ctor) {
    var paramExp = Expression.Parameter(typeof(object[]), "args");
    var arguments = ctor.GetParameters().Select((x, i) =>
        Expression.Convert(Expression.ArrayIndex(paramExp, Expression.Constant(i)), x.ParameterType)
    ).ToArray();
    var newExpr = Expression.New(ctor, arguments);
    return (ObjectActivator)Expression.Lambda(typeof(ObjectActivator), newExpr, paramExp).Compile();
}


