def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)


 def decorator(function):
	if after:
		ret_val = afterDecorator(function, event)
		return ret_val
	else:
		ret_val = beforeDecorator(function, event)
		return ret_val


