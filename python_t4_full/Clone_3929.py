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
    freqs = [sequence[i+1] - sequence[i] for i in range(len(sequence)-1)]
    return sum(1 for i in freqs if i <= 0) <= 1

    




