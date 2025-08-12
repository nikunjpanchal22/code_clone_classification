def num_subsequences(seq, sub) :
	if not sub :
		return 1
	elif not seq :
		return 0
	result = num_subsequences(seq [1 :], sub)
	if seq [0] == sub [0] :
		result += num_subsequences(seq [1 :], sub [1 :])
	return result


 def num_subsequences(seq, sub): 
	if len(sub) == 0: 
		return 1
	elif len(seq) == 0: 
		return 0 
	else: 
		result = 0 
		if seq[0] == sub[0]: 
			result = num_subsequences(seq[1:], sub[1:]) 
		result += num_subsequences(seq[1:], sub) 
		return result


