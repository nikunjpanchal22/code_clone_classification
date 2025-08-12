def decorator(function) :
	if after :
		return afterDecorator(function, event)
	else :
		return beforeDecorator(function, event)





def deprecate(func):
    def wrapper(*args, **kwargs):
        print(f"Warning: {func.__name__} is deprecated")


