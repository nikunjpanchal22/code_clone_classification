def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(list_):
    stack = []
    for item in list_:
        if isinstance(item, collections.Iterable) and not isinstance(item, basestring):
            stack.append(item)
        else:
            yield item
    while len(stack):
        item = stack.pop()
        for element in item:
            if isinstance(element, collections.Iterable) and not isinstance(element, basestring):
                stack.append(element)
            else:
                yield element


