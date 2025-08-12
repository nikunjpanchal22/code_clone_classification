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
    flat_list = []
    if isinstance(iterable, str):
        return [iterable]
    for item in iterable:
        if isinstance(item, list):
            flat_list.extend(flatten(item))
        else:
            flat_list.append(item)
    return flat_list


