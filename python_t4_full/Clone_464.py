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
         
    curr_item = seq[0]
    if isinstance(curr_item, list):
        return flatten_list(seq[0]) + flatten_list(seq[1:])
    else:
        return [curr_item] + flatten_list(seq[1:])


