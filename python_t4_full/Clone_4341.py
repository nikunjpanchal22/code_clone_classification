def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)


    def wrapper(arg):
        if isinstance(arg, int):
            return func(arg)
        else:
            print("Argument must be an integer")


