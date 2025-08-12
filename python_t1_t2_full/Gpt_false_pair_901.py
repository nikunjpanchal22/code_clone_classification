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
    removedIdx = []
    for idx, entry in enumerate(list) :
        tmp = []
        for i in range(idx - 1, - 1, -1) :
            if list[idx] <= list[i] :
                tmp.append(i)
        if len(tmp) > 1 :
            removedIdx.append(idx)
        else :
            if len(tmp) > 0 :
                removedIdx.append(tmp[0])
    return len(set(removedIdx)) <= 1
