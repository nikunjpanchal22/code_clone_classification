def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el



 def flatten(data):
    # the output
    result = []
    # loop all items
    for x in data:
        # if it is a list then loop over it 
        if isinstance(x, collections.Iterable) and not isinstance(x, basestring):
            result += flatten(x)
        # append item
        else:
            result.append(x)
    # return all items


