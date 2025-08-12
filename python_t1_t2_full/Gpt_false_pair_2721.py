def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el




def flatten(otherList) :
	for element in otherList :
		if isinstance(element, collections.Iterable) and not isinstance(element, basestring) :
			for subElement in flatten(element) :
				yield subElement
		else :
			yield element 

