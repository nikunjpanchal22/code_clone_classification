def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(inList):
    outList = []
    while inList != []:
        curElement = inList.pop(0)
        if isinstance(curElement, list):
            inList = curElement + inList
        else:
            outList.append(curElement)
    return outList


