def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)






def decorator(function) :
	if after is None:
		return beforeDecorator(function, event)


