def flatten_list(seq) :
	if not seq :
		return []
	elif isinstance(seq [0], list) :
		return (flatten_list(seq [0]) + flatten_list(seq [1 :]))
	else :
		return [seq [0]] + flatten_list(seq [1 :])



def flatten_list(seq):
    if seq == []:
        return seq
    if isinstance(seq[0], list):
        return flatten_list(seq[0]) + flatten_list(seq[1:])
    return seq[:1] + flatten_list(seq[1:])




