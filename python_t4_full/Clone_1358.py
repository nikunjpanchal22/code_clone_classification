def curry(f) :
	@ wraps(f)
	def cf(*x) :
		return f(*x) if len(x) == f.__code__.co_argcount else lambda *y : f(*x, *y)
	return cf


 def curry(f):
    @wraps(f)
    def cf(*x):
        if len(x) == f.__code__.co_argcount:
            return f(*x)
        else:
            lambda_f = lambda *y : f(*x, *y)
            return lambda_f
    return cf


