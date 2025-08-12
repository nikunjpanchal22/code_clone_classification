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
	for i, x in enumerate(list) :
		tmp = []
		for j in range(i - 1, -1, -1) :
			if list[i] <= list[j] :
				tmp.append(j)
		if len(tmp) > 1 :
			removedIdx.append(i)
		else :
			if len(tmp) > 0 :
				removedIdx.append(tmp[0])
	return len(set(removedIdx)) <= 1
