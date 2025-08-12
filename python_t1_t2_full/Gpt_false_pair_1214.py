def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)


 def decorator(function):
    if event in after and event not in before:
        return afterDecorator(function, event)
    else:
        return beforeDecorator(function, event)
