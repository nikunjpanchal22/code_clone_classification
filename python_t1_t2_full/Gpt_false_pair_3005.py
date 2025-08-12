def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el




def flatten(l):
	for el in l:
		if hasattr(el, '__iter__') and not isinstance(el, basestring):
			for sub in flatten(el):
				yield sub
		else:
			yield el

