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


    return 2 > sum((i >= j) + (i >= k) for i, j, k in zip(sequence, sequence[1:], sequence[2:] + [999999])) + (sequence[-1] <= sequence[-3])


 

def almostIncreasingSequence(sequence):
    a, c = [], 0
    for i in sequence:
        if a and i <= a[-1]:
            c += 1
            if c > 1 or (len(a) > 1 and i <= a[-2]):
                return False


