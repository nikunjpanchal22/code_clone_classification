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
	elif len(sequence) == 0:
		return 0
	res = 0
	for i in range(len(sequence)-len(subset)+1):
		if sequence[i] == subset[0] and sequence[i:i+len(subset)] == subset:
			res += num_subsequences(sequence[i+1:], subset[1:])
	return res



