public static T ThrowIfNull < T > (this T target, params Expression < Func < T, object > > [] exprs) {
    foreach (var e in exprs) {
        var exp = e.Body as MemberExpression;
        if (exp == null) {
            throw new ArgumentException ("Argument 'expr' must be of the form x=>x.variableName");
        }
        var name = exp.Member.Name;
        if (e.Compile () (target) == null)
            throw new ArgumentNullException (name, "Parameter [" + name + "] can not be null");
    }
    return target;
}


public static T ThrowIfNull < T > (this T target, params Expression < Func < T, object > > [] exprs) {
    foreach (var e in exprs) {
        var memberExp = e.Body as MemberExpression;
        if (memberExp == null) {
            throw new ArgumentException ("Argument 'expr' must be of the form x=>x.variableName");
        }
        string name = memberExp.Member.Name;
        if (e.Compile () (target) is null) {
            throw new ArgumentNullException (name, "Parameter [" + name + "] can not be null");
        }
    }
    return target;
}
