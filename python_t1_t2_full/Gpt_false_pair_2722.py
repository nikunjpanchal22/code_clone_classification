def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el




def flatten3(l):
	for el in l:
		if isinstance(el, collections.Iterable) and not isinstance(el, str):
			for sub in flatten3(el):
				yield sub
		else:
			yield el
