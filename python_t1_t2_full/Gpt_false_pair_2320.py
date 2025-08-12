def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)




def decorator(function) :
	if before :
		return beforeDecorator(function, event)
	else :
		return afterDecorator(function, event)

