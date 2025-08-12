def num_subsequences(seq, sub) :
	if not sub :
		return 1
	elif not seq :
		return 0
	result = num_subsequences(seq [1 :], sub)
	if seq [0] == sub [0] :
		result += num_subsequences(seq [1 :], sub [1 :])
	return result


  if not sub: result = 1
  return result




def num_subsequences(seq, sub):
  if seq and sub: return num_subsequences(seq[1:], sub)+(num_subsequences(seq[1:], sub[1:]) if seq[0] == sub[0] else 0)
  if not seq: return 0
  if not sub: return 1


