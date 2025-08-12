def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(arry):
    flatt_list = []
    for el in arry:
        if isinstance(el, collections.Iterable) and not isinstance(el, basestring):
            flatt_list.extend(flatten(el))
        else:
            flatt_list.append(el)
    return flatt_list


