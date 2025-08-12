def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)




def decorator(function) :
	if after :
		return afterDecorator(function, "my_event")
	else :
		return beforeDecorator(function, "my_event")


