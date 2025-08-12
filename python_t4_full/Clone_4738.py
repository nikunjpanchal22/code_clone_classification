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
    iterable = iter(iterable)
    stack = []

    while iterable:
        try:
            item = next(iterable)
        except StopIteration:
            try:
                iterable = stack.pop()
            except IndexError:
                break
        else:
            if isinstance(item, str):
                yield item
            else:
                try:
                    stack.append(iterable)
                    iterable = iter(item)
                except TypeError:
                    yield item



