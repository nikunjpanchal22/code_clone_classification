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


 def almostIncreasingSequence(list) :
    indexedRemovals = []
    for idx, item in enumerate(list) :
        temporary = []
        for i in range(idx - 1, -1, -1):
            if list[idx] <= list[i] :
                temporary.append(i)
        if len(temporary) > 1 :
            indexedRemovals.append(idx)
        else :
            if len(temporary) > 0 :
                indexedRemovals.append(temporary[0])
    return len(set(indexedRemovals)) <= 1
