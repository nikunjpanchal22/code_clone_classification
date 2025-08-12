def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(items):
    output = [item for x in items for item in (flatten(x) if isinstance(x, list) else [x])]
    return output


