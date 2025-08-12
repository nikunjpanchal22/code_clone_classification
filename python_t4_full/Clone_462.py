def flatten_list(seq) :
	if not seq :
		return []
	elif isinstance(seq [0], list) :
		return (flatten_list(seq [0]) + flatten_list(seq [1 :]))
	else :
		return [seq [0]] + flatten_list(seq [1 :])


 def flatten_list(seq):
    stack = [seq]
    flattened = []

    while stack:
        top = stack.pop(-1)
        if isinstance(top, list):
            stack += top
        else:
            flattened.append(top)
    return flattened


