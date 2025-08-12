def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


def flatten(l): 
	if not l:
		return []
	if isinstance(l[0], list):
		return flatten(l[0]) + flatten(l[1:])
	return l[:1] + flatten(l[1:])

 



