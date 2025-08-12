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
    var paramsInfo = ctor.GetParameters ();
    var param = Expression.Parameter (typeof (object []), "args");
    var argsExp = new Expression [paramsInfo.Length];
    for (int i = 0; i < paramsInfo.Length; i ++)
        argsExp[i] = Expression.Convert (Expression.ArrayIndex (param, Expression.Constant (i)), paramsInfo[i].ParameterType);
    var lambda = Expression.Lambda (typeof (ObjectActivator), Expression.New (ctor, argsExp), param);
    return (ObjectActivator) lambda.Compile ();
}


