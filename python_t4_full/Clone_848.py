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
	for i in range(len(seq)): 
		if seq[i] == sub[0]: 
			if i + len(sub) <= len(seq): 
				if seq[i: i+len(sub)] == sub:
					result += num_subsequences(seq[i+len(sub):], sub[1:]) 


