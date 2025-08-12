def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)


 def decorator(function) :
	result = None
	if event in after :
		result = afterDecorator(function, event)
	else :
		result = beforeDecorator(function, event)
	return result


