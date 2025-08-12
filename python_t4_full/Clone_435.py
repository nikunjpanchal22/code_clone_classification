def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(l):
    if isinstance(l, collections.Iterable) and not isinstance(l, basestring):
        return reduce(lambda x,y: x+y, map(flatten, l))
    else:
        return [l]


