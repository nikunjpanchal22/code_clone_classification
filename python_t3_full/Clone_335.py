def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el



 def flatten(arr):
    result = []
    for el in arr:
        if isinstance(el, collections.Iterable) and not isinstance(el, basestring): 
            for item in flatten(el):
                result.append(item)
        else:
            result.append(el)


