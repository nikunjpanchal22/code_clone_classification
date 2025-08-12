def flatten_list(seq) :
	if not seq :
		return []
	elif isinstance(seq [0], list) :
		return (flatten_list(seq [0]) + flatten_list(seq [1 :]))
	else :
		return [seq [0]] + flatten_list(seq [1 :])


 def flatten_list(seq):
    result = []
    queue = seq[:]

    while queue:
        item = queue.pop(0)
        if isinstance(item, list):
            for i,v in enumerate(item):
                queue.insert(i, v)
            
        else:
            result.append(item)

    return result


