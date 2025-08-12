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
	var unaryExpression = expressionBody as UnaryExpression;
    MemberExpression memberExpression;
    if (unaryExpression != null) {
        memberExpression = unaryExpression.Operand as MemberExpression;
    } else {
        memberExpression = expressionBody as MemberExpression;
    }
    if (memberExpression != null) {
        var propertyInfo = memberExpression.Member as PropertyInfo;
        return propertyInfo.Name;
    }
    else
    {
        Debug.Assert(memberExpression != null, "Please provide a lambda expression like 'n => n.PropertyName'");
        return null;
    }
}


