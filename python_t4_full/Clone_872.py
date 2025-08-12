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
	end_1st = len(seq) - 1 
	end_2nd = len(sub) - 1
	if seq[0] == sub[0] and seq[end_1st] == sub[end_2nd]:
		start_match = num_subsequences(seq[1:end_1st], sub[1:end_2nd])
	else:
		start_match = 0
	return start_match + num_subsequences(seq[1:], sub)




