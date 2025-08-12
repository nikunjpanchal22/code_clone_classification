def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0




  def almostIncreasingSequence (sequence) :
		count = 0
		for i in range(len(sequence) ) :
			t = sequence.copy()
			del t [i]
			if t == sorted(t) and not (any(i == j for i, j in zip(sorted(t), sorted(t) [1 :]))) :
				count += 1
		return count > 0

