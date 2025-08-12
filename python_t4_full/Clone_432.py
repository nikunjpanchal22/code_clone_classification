def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(l):
    output = []
    for i in l:
        if type(i) == list:
            output.extend(flatten(i))
        else:
            output.append(i)
    return output


