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
    if not seq:
        return 0
    start = 0
    end = len(seq) - 1
    if seq[start] == sub[start] and seq[end] == sub[end]:
        return num_subsequences(seq[1:end], sub[1:end]) + num_subsequences(seq[start+1:end], sub[start:])
    return num_subsequences(seq[start+1:end], sub[start:])




