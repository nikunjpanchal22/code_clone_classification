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
    elif not seq:
        return 0
    result = 0
    l = len(seq)
    n = len(sub)
    for i in range(l):
        k = 0
        cnt = 0
        for j in range(i, l):
            if seq[j] == sub[k]:
                cnt += 1
                k += 1
                if cnt == n:
                    result += 1


