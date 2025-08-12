def num_subsequences(seq, sub) :
	if not sub :
		return 1
	elif not seq :
		return 0
	result = num_subsequences(seq [1 :], sub)
	if seq [0] == sub [0] :
		result += num_subsequences(seq [1 :], sub [1 :])
	return result


#gpt output=============
 def num_subsequences(seq, sub): 
    if not sub: 
        return 1
    elif not seq: 
        return 0
    else:
        temp = 0
        while(seq != [] and sub != []):
            if sub[0] == seq[0]:
                temp +=num_subsequences(seq[1:], sub[1:]) 
            seq = seq[1:] 


