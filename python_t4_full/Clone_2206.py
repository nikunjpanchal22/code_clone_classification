def flatten(container) :
	for i in container :
		if isinstance(i, (list, tuple)) :
			for j in flatten(i) :
				yield j
		else :
			yield i


 def flatten(container): 
    if not isinstance(container, (list, tuple)):
        return [container]

    flattened_list = []
    for item in container:
        flattened_list.extend(flatten(item))

    return flattened_list


