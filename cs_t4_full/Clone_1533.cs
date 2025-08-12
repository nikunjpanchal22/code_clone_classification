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


 private static string GetPropertyName<TPropertySource>(Expression<Func<TPropertySource, object>> expression)
{
    MemberExpression memberExpression;

    if (expression.Body is UnaryExpression unaryExpression)
    {
        memberExpression = (MemberExpression)unaryExpression.Operand;
    }
    else
    {
        memberExpression = (MemberExpression)expression.Body;
    }

    if (memberExpression == null)
    {
        Debug.Assert(memberExpression != null, "Please provide a lambda expression like 'n => n.PropertyName'");
        return null;
    }

    var propertyInfo = (PropertyInfo)memberExpression.Member;
    return propertyInfo.Name;
}


