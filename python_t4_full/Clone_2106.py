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
    stack=[]
    result=[]
    stack.append(iter(iterable))
    while(stack):
        element=stack.pop()
        try:
            iterator=iter(element)
            for it in iterator:
                stack.append(it)
        except TypeError:
            result.append(element)
    return result


