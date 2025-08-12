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






def almostIncreasingSequence(sequence):
    found_count = 0
    for i in range(1, len(sequence)):
        if sequence[i - 1] >= sequence[i]: 
            found_count += 1
            if found_count > 1: return False


