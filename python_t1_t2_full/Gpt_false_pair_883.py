def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


  def almostIncreasingSequence(sequence):
    result = 0 
    for index in range(len(sequence)):
        new_sequence = sequence.copy()
        del new_sequence[index]
        if new_sequence == sorted(list(dict.fromkeys(new_sequence))):
            result += 1
    return result > 0
