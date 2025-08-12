private static string GetPropertyName < TPropertySource > (Expression < Func < TPropertySource, object > > expression) {
    var lambda = expression as LambdaExpression;
    MemberExpression memberExpression;
    if (lambda.Body is UnaryExpression) {
        var unaryExpression = lambda.Body as UnaryExpression;
        memberExpression = unaryExpression.Operand as MemberExpression;
    } else {
        memberExpression = lambda.Body as MemberExpression;
    }
    Debug.Assert (memberExpression != null, "Please provide a lambda expression like 'n => n.PropertyName'");
    if (memberExpression != null) {
        var propertyInfo = memberExpression.Member as PropertyInfo;
        return propertyInfo.Name;
    }
    return null;
}


 private static string GetPropertyName < TPropertySource > (Expression < Func < TPropertySource, object > > expression) {
    var expressionBody = expression.Body;
    MemberExpression memberExpression = null;
    if (expressionBody is UnaryExpression) {
        var unaryExpression = expressionBody as UnaryExpression;
        memberExpression = unaryExpression.Operand as MemberExpression;
    } else 
        memberExpression = expressionBody as MemberExpression;
    if (memberExpression == null) 
        Debug.Assert (memberExpression != null, "Please provide a lambda expression like 'n => n.PropertyName'");
    PropertyInfo propertyInfo = memberExpression?.Member as PropertyInfo;
    return propertyInfo?.Name;
}


