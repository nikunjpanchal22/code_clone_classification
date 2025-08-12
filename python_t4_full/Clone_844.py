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
	i = 0
	while i < len(seq): 
		if seq[i] == sub[0]: 
			n = i + len(sub) 
			if seq[i:n] == sub: 
				result += num_subsequences(seq[n:], sub[1:]) 
		i += 1


