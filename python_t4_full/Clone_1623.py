def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)


 def decorator(function):
	decorator = None
	if after:
		decorator = afterDecorator(function, event)
	elif before:
		decorator = beforeDecorator(function, event)
	else:
		decorator = function
	return decorator


