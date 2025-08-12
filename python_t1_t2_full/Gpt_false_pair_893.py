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


 def almostIncreasingSequence(sequence) :
    deletingIdx = []
    for i, x in enumerate(sequence) :
        temp = []
        for j in reversed(range(0, i)):
            if sequence[i] <= sequence[j] :
                temp.append(j)
        if len(temp) > 1 :
            deletingIdx.append(i)
        else :
            if len(temp) > 0 :
                deletingIdx.append(temp[0])
    return len(set(deletingIdx)) <= 1
