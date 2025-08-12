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
    
    stack = []
    flat_list = []

    for x in seq:
        if isinstance(x, list):
            stack.append(x)
        else:
            flat_list.append(x)
    
    while stack:
        current_list = stack.pop(0)
        
        for x in current_list:
            if isinstance(x, list):
                stack.append(x)
            else:
                flat_list.append(x)
    
    return flat_list


