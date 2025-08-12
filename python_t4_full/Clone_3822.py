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
    def helper(seq, sub, m, n):
        if n == 0: return 1
        if m == 0: return 0
        if seq[m-1] != sub[n-1]: return helper(seq, sub, m-1, n)
        return helper(seq, sub, m-1, n) + helper(seq, sub, m-1, n-1)
    return helper(seq, sub, len(seq), len(sub))




