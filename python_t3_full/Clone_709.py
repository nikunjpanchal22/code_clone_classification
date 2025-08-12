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
	if sequence[0] == subset[0]: 
		return num_subsequences(sequence[1:], subset[1:]) + num_subsequences(sequence[1:], subset)
	else:
		return num_subsequences(sequence[1:], subset)



