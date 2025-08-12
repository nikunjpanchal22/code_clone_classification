def flatten(container) :
	for i in container :
		if isinstance(i, (list, tuple)) :
			for j in flatten(i) :
				yield j
		else :
			yield i


 def flatten(container): 
    flatList = [] 
    for i in container: 
        if isinstance(i, (list, tuple)):
            for sublist in flatten(i): 
                flatList.append(sublist)
        else:
            flatList.append(i)
    return flatList 


