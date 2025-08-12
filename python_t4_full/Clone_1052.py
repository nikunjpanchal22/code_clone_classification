def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


  def almostIncreasingSequence(sequence):
    new_sequence = []
    for index, num in enumerate(sequence):
        if index != 0:
            del new_sequence[:]
            for i in range(index):
                new_sequence.append(sequence[i])
            for j in range(index+1, len(sequence)):
                new_sequence.append(sequence[j])
            if new_sequence == sorted(list(dict.fromkeys(new_sequence))):
                return True
    return False


