def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el




def flatten4(l) : 
	for el in l :
		if isinstance(el, collections.abc.Iterable) and not isinstance(el, (str, bytes)) :
			for sub in flatten4(el) :
				yield sub
		else :
			yield el
