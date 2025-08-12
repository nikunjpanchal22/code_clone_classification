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
    if sub == '':
        return 1
    if seq == '':
        return 0
    initial_match = 1 if seq[0] == sub[0] else 0
    return initial_match + num_subsequences(seq[1:], sub[1:]) + num_subsequences(seq[1:], sub)


