def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


  def almostIncreasingSequence(sequence):
    temp = []
    for i in range(len(sequence)):
        t = sequence.copy()
        del t[i]
        temp.append(t)
    unique_values = [dict.fromkeys(i) for i in temp] 
    check_duplicates = [any(i == j for i, j in zip(sorted(unique_values[i]), sorted(unique_values[i])[1:])) for i in range(len(unique_values))]
    return (sum(1 for i in check_duplicates if not i) > 0)


