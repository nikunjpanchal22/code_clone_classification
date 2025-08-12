def flatten(container) :
	for i in container :
		if isinstance(i, (list, tuple)) :
			for j in flatten(i) :
				yield j
		else :
			yield i



def flatten(container):
    stack = list(reversed(container))
    while stack:
        x = stack.pop()
        if isinstance(x, (list, tuple)):
            stack.extend(reversed(x))
        else:
            yield x




