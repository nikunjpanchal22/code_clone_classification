def flatten(container) :
	for i in container :
		if isinstance(i, (list, tuple)) :
			for j in flatten(i) :
				yield j
		else :
			yield i


 def flatten(container):
    if isinstance(container, (list, tuple)):
        return [item for sublist in container for item in flatten(sublist)]
    else:
        return [container]


