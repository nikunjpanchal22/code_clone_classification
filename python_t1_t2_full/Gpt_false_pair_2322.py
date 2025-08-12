def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)




def decorator(func) :
	if after :
		return afterDecorator(func, event)
	return beforeDecorator(func, event)
