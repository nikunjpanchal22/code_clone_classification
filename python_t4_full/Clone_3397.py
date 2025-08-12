def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el





def flatten(l):
    result = []
    for el in l:
        if isinstance(el, list):
            result.extend(flatten(el))
        else:
            result.append(el)
    return result



