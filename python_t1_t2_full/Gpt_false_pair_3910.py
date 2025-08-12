def num_subsequences(seq, sub) :
	if not sub :
		return 1
	elif not seq :
		return 0
	result = num_subsequences(seq [1 :], sub)
	if seq [0] == sub [0] :
		result += num_subsequences(seq [1 :], sub [1 :])
	return result




def subseq_count(seq, sub):
  if not sub:
    return 1
  elif not seq:
    return 0
  result = subseq_count(seq[1:], sub)
  if seq[0] == sub[0]:
    result += subseq_count(seq[1:], sub[1:])
  return result
