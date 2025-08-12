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





from collections.abc import Iterable

def flatten(iterable):
    stack = list(iterable)
    while stack:
        item = stack.pop()
        if isinstance(item, Iterable) and not isinstance(item, str):
            stack.extend(item[::-1])


