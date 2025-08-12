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
	if seq == [] and sub == []:							# Base Case: when both seq and sub lists are empty	
		return 1
	elif seq == [] and sub != []:						# Case: when there are elements in sub list only
		return 0
	else:
		result = num_subsequences(seq[1:], sub)		# Recursive call without adding the first element of seq list
		if seq[0] == sub[0]:							# Comparing the first element of seq and sub list
			result += num_subsequences(seq[1:], sub[1:])# Adding the first element of seq list if it matches the first element of sub list
	return result


