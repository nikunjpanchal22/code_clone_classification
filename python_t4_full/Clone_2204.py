def flatten(container) :
	for i in container :
		if isinstance(i, (list, tuple)) :
			for j in flatten(i) :
				yield j
		else :
			yield i


 def flatten(container): 
    newList = []
    for i in container:
        if isinstance(i, (list, tuple)):
            newList.extend(flatten(i))
        else:
            newList.append(i)
    return newList


