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
	result, start, i = 0, 0, 0 
	while start < len(seq): 
		if seq[i] == sub[0]: 
			result += num_subsequences(seq[i + 1:], sub[1:]) 
		start += 1 
		i = start 
	return result


