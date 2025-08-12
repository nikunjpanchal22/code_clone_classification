def flatten(container) :
	for i in container :
		if isinstance(i, (list, tuple)) :
			for j in flatten(i) :
				yield j
		else :
			yield i


 def flatten(container):
    stack = [container]
    flattened_list = []

    while stack:
        item = stack.pop()

        if isinstance(item, (list, tuple)):
            stack.extend(item)
        else:
            flattened_list.append(item)

    return flattened_list


