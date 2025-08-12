def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(list_):
    stack = list(list_)
    result = []
    while stack:
        curr_item = stack.pop()
        if isinstance(curr_item, collections.Iterable) and not isinstance(curr_item, str):
            stack.extend(curr_item)
        else:
            result.append(curr_item)
    return result[::-1]


