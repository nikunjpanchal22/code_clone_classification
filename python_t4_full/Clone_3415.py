def flatten_list(seq) :
	if not seq :
		return []
	elif isinstance(seq [0], list) :
		return (flatten_list(seq [0]) + flatten_list(seq [1 :]))
	else :
		return [seq [0]] + flatten_list(seq [1 :])



def flatten_list(seq):
    flat_list = []
    for sublist in seq:
        flat_list.extend(sublist)
    return flat_list




