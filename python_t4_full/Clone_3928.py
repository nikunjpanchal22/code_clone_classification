def almostIncreasingSequence(list) :
	removedIdx = []
	for idx, item in enumerate(list) :
		tmp = []
		for i in range(idx - 1, - 1, - 1) :
			if list [idx] < = list [i] :
				tmp.append(i)
		if len(tmp) > 1 :
			removedIdx.append(idx)
		else :
			if len(tmp) > 0 :
				removedIdx.append(tmp [0])
	return len(set(removedIdx)) < = 1




def almostIncreasingSequence(seq):
    droppable = sum((i >= j) + (i >= k) for i, j, k in zip(seq, seq[1:], seq[2:])) <= 1 
    if droppable: return True 
    else: return False


