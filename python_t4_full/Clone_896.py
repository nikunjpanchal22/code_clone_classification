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
	if not sub and not seq: 
		return 1 
	elif not seq: 
		return 0 
	result, s, ss = 0, seq[0], seq[1:] 
	if s == sub[0]: 
		result += num_subsequences(ss, sub[1:]) 
		if ss: 
			result += num_subsequences(ss, sub) 
	else: 
		result += num_subsequences(ss, sub) 
	return result


