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
    def num_subsequences_len(seq, i, sub, j):
        if j == len(sub):
            return 1
        if i == len(seq):
            return 0
        if seq[i] != sub[j]:
            return num_subsequences_len(seq, i+1, sub, j)
        return num_subsequences_len(seq, i+1, sub, j) + num_subsequences_len(seq, i+1, sub, j+1)
    return num_subsequences_len(seq, 0, sub, 0)




