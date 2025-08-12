def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(items):
    flattened_list = []
    for item in items:
        if type(item) is list:
            flattened_list += flatten(item)
        else:
            flattened_list.append(item)
    return flattened_list


