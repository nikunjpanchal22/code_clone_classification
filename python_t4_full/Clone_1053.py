def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


  def almostIncreasingSequence(sequence): 
    modified_sequence = []
    for i in range(len(sequence)):  
        temp = sequence.copy() 
        del temp[i] 
        modified_sequence.append(temp) 

    unique_items = list(map(dict.fromkeys, modified_sequence)) 
    check = [any(i==j for i, j in zip(sorted(temp), sorted(temp)[1:])) for temp in unique_items]
    return (sum(1 for i in check if not i) > 0)


