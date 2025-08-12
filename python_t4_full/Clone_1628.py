def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)



 def decorator(function):
	if after and (event in after):
		decorator = afterDecorator(function, event)
	elif not after and (event not in after):
		decorator = beforeDecorator(function, event)
	return decorator


