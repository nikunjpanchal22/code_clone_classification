def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(inputList): 
    outputList = [] 
    for item in inputList: 
        if type(item) == list: 
            outputList += flatten(item) 
        else: 
            outputList.append(item) 
    return outputList


