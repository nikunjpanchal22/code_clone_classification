def flatten_list(seq) :
	if not seq :
		return []
	elif isinstance(seq [0], list) :
		return (flatten_list(seq [0]) + flatten_list(seq [1 :]))
	else :
		return [seq [0]] + flatten_list(seq [1 :])


 def flatten_list(seq): 
    flat_list = [] 
    for inner_list in seq: 
        if isinstance(inner_list, list): 
            flat_list += flatten_list(inner_list) 
        else: 
            flat_list.append(inner_list) 
    return flat_list


