def flatten_list(seq) :
	if not seq :
		return []
	elif isinstance(seq [0], list) :
		return (flatten_list(seq [0]) + flatten_list(seq [1 :]))
	else :
		return [seq [0]] + flatten_list(seq [1 :])


  def flatten_list(seq):
    flattened_list = []

    for item in seq:
        if type(item) == list and item:
            flattened_list.extend(flatten_list(item))
        else:
            flattened_list.append(item)
    
    return flattened_list


