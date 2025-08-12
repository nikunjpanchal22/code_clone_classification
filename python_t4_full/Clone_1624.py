def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)


 def decorator(function):
    if before and (event not in after):
        return beforeDecorator(function, event)
    elif after and (event in after):
        return afterDecorator(function, event)
    else:
        return function


