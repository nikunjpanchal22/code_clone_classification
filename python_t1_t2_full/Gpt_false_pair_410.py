def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(list_):
    for item in list_:
        if isinstance(item, collections.Iterable) and not isinstance(item, str):
            for element in flatten(item):
                yield element
        else:
            yield item
