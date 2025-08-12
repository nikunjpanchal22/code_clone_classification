def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


  def almostIncreasingSequence(sequence): 
    final_count = 0
    for index, value in enumerate(sequence):
        new_sequence = [i for i in sequence if i != value]
        if new_sequence == sorted(list(dict.fromkeys(new_sequence))):
            final_count += 1
    return final_count > 0


