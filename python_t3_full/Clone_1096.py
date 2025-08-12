def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)


 def decorator(function) :
	try:
		if after :
			return afterDecorator(function, event)
	except:
		return beforeDecorator(function, event)


