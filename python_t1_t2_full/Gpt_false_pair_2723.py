def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el




def unpack(theInput) :
	for item in theInput :
		if isinstance(item, collections.Iterable) and not isinstance(item, basestring) :
			for subItem in unpack(item) :
				yield subItem
		else :
			yield item
