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
	if not sub: 
		return 1 
	elif not seq: 
		return 0
	result = 0 
	for index, s in enumerate(seq): 
		if s == sub[0]: 
			if seq[index:index+len(sub)] == sub: 
				result += num_subsequences(seq[index+len(sub):], sub[1:]) 


