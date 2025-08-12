def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0



 def almostIncreasingSequence(sequence):
    sum = 0
    for index in range(len(sequence)):
        sequence_copy = sequence.copy()
        del sequence_copy[index]
        if sequence_copy == sorted(sequence_copy) and not any(f == g for f, g in zip(sorted(sequence_copy), sorted(sequence_copy)[1:])):
            sum += 1


