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


	private static string GetPropertyName < TPropertySource > (Expression < Func < TPropertySource, object > > expression) 
	{
    	var lambda = expression as LambdaExpression;
    	if (lambda.Body is UnaryExpression) 
		{
        	var unaryExpr = lambda.Body as UnaryExpression;
        	if (unaryExpr.Operand is MemberExpression) 
			{
            	var memberExpression = unaryExpr.Operand as MemberExpression;
            	var propertyInfo = memberExpression.Member as PropertyInfo;
            	return propertyInfo.Name;
        	}
    	}
    	else if (lambda.Body is MemberExpression)
		{
        	var memberExpression = lambda.Body as MemberExpression;
        	var propertyInfo = memberExpression.Member as PropertyInfo;
        	return propertyInfo.Name;
    	}
   		 Debug.Assert (false, "Please provide a lambda expression like 'n => n.PropertyName'");
    	return null;
}


