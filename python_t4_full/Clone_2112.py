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


 def flatten(l):
    flat_list = [] 
    for elem in l: 
        if not isinstance(elem, list):
            flat_list.append(elem)
        else:
            flattened_list = flatten(elem)
            flat_list.extend(flattened_list)
    return flat_list


