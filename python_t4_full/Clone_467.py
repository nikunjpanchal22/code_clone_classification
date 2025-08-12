def flatten_list(seq) :
	if not seq :
		return []
	elif isinstance(seq [0], list) :
		return (flatten_list(seq [0]) + flatten_list(seq [1 :]))
	else :
		return [seq [0]] + flatten_list(seq [1 :])


 def flatten_list(seq):
    result = []
    
    for item in seq:
        if isinstance(item, list):
            result.extend(flatten_list(item))
        else:
            result.append(item)
    
    return result


