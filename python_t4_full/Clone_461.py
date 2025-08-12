def flatten_list(seq) :
	if not seq :
		return []
	elif isinstance(seq [0], list) :
		return (flatten_list(seq [0]) + flatten_list(seq [1 :]))
	else :
		return [seq [0]] + flatten_list(seq [1 :])


 def flatten_list(seq):
    if not seq:
        return []

    flattened_list = []
    for item in seq:
        if isinstance(item, list):
            flattened_list += flatten_list(item)
        else:
            flattened_list.append(item)

    return flattened_list


