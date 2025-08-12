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
	if subset == '':
		return 1
	if sequence == '':
		return 0
	total_count = 0
	i = 0
	while i < len(sequence):
		if sequence[i] == subset[0]:
			total_count += num_subsequences(sequence[i+1:], subset[1:])
		i += 1
	return total_count



