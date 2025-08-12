def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el




def flatten(l):
    return sum(l, [])




def flatten(l):
    result = []

    def recursive_list(l):
        for el in l:
            if isinstance(el, list):
                recursive_list(el)
            else:
                result.append(el)


