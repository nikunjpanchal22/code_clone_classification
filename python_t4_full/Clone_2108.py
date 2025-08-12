def flatten(iterable) :
	iterator, sentinel, stack = iter(iterable), object(), []
	while True :
		value = next(iterator, sentinel)
		if value is sentinel :
			if not stack :
				break
			iterator = stack.pop()
		elif isinstance(value, str) :
			yield value
		else :
			try :
				new_iterator = iter(value)
			except TypeError :
				yield value
			else :
				stack.append(iterator)
				iterator = new_iterator


 def flatten(iterable):
    output = []
    def recursion(iterable):
        if isinstance(iterable, str):
            output.append(iterable)
            return
        else:
            for item in iterable:
                recursion(item)
    recursion(iterable)
    return output


