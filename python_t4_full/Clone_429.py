def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(l):
    output = []
    stack = l
    while stack:
        value = stack.pop(0)
        if isinstance(value, list):
            stack = value + stack
        else:
            output.append(value)
    return output


