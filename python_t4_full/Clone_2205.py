def flatten(container) :
	for i in container :
		if isinstance(i, (list, tuple)) :
			for j in flatten(i) :
				yield j
		else :
			yield i


 def flatten(container):   
    finalList = []

    for item in container:
        if type(item) == list or type(item) == tuple:
            finalList.extend(flatten(item))
        else:
            finalList.append(item)
        
    return finalList


