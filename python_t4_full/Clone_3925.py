def almostIncreasingSequence(sequence) :
	for i, x in enumerate(sequence) :
		ret = False
		s = sequence [: i] + sequence [i + 1 :]
		for j, y in enumerate(s [1 :]) :
			if s [j + 1] < = s [j] :
				ret = True
				break
			if ret :
				break
		if not ret :
			return True
	return False


            if sequence[x - 1] < sequence[x + 1]:
                sequence.pop(x)
            else:
                sequence.pop(x + 1)
            break
    return sequence == sorted(set(sequence))




def almostIncreasingSequence(sequence):
    def solve(sequence):
        for i in range(len(sequence) - 1):
            if sequence[i] >= sequence[i + 1]:
                return False


