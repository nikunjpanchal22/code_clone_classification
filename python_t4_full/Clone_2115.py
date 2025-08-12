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


  def flatten(list):
    result=[]
    for i in list:
        if isinstance(i, list):
            result+=flatten(i)
        else:
            result.append(i)
    return result


