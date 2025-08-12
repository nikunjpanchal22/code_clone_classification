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
    deletedIdx = []
    for x in enumerate(list) :
        temp = []
        for i in range(x[0] - 1, -1, -1) :
            if list[x[0]] <= list[i] :
                temp.append(i)
        if len(temp) > 1 :
            deletedIdx.append(x[0])
        else :
            if len(temp) > 0 :
                deletedIdx.append(temp[0])
    return len(set(deletedIdx)) <= 1


