def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)





def to_string(func):
    def wrapper(arg):
        return str(func(arg))


