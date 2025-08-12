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
    Type t = ctor.DeclaringType;
    ParameterExpression pExpr = Expression.Parameter (typeof (object []), "args");
    var parameters = ctor.GetParameters ();
    Expression[] arguments = new Expression[parameters.Length];
    for (int i = 0; i < parameters.Length; i++)
        arguments[i] = Expression.Convert(Expression.ArrayIndex(pExpr, Expression.Constant(i)), parameters[i].ParameterType);
    Expression exp = Expression.Lambda(typeof (ObjectActivator), Expression.New(ctor, arguments), pExpr);
    return (ObjectActivator) exp.Compile ();
}


