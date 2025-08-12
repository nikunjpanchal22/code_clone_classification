def flatten(container) :
	for i in container :
		if isinstance(i, (list, tuple)) :
			for j in flatten(i) :
				yield j
		else :
			yield i



def flatten(container):
    flat = []
    for i in container:
        if isinstance(i, (list, tuple)):
            flat.extend(flatten(i))
        else:
            flat.append(i)
    return flat




