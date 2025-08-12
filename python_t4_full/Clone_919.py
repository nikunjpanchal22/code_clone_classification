def num_subsequences(seq, sub) :
	if not sub :
		return 1
	elif not seq :
		return 0
	result = num_subsequences(seq [1 :], sub)
	if seq [0] == sub [0] :
		result += num_subsequences(seq [1 :], sub [1 :])
	return result


def num_subsequences(sequence, subset):
	if not subset:	
		return 1
	elif not sequence:
		return 0
	temp_sequence = sequence[0]
	result = 0 
	while temp_sequence:
		if temp_sequence[0] == subset[0]:
			result += num_subsequences(sequence[len(temp_sequence):], subset[1:])
		sequence = sequence[1:]
		if sequence :
			temp_sequence = temp_sequence + sequence[0]
		else : 
			temp_sequence = ""
	return result



