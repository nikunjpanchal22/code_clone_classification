def next_bigger(a) :
	a = map(int, str(a))
	tmp = list(reversed(a))
	for i, item_a in enumerate(reversed(a)) :
		for j in (range(i)) :
			if item_a < tmp [j] :
				tmp [i] = tmp [j]
				print (list(reversed(tmp [i :])))
				tmp [j] = item_a
				fin = list(reversed(tmp [i :])) + sorted(tmp [: i])
				return functools.reduce(lambda x, y : x * 10 + y, fin)
	return - 1


 def next_bigger(a):
	# Taking the value of a as a list
	aList = list(str(a))
	
	# Loop through the list in reverse
	index_1 = -1
	index_2 = -1 
	for i in range(len(aList)-2, -1, -1):
		# If the current digit is less than the next digit, set index_1 to the current index
		if(int(aList[i]) < int(aList[i+1])):
			index_1 = i
	
	# If index_1 is not -1,  loop through the list starting at the digit after index_1
	if(index_1 != -1):
		for j in range(index_1+1, len(aList)):
			# If the digit is the smallest one greater than the digit at index_1
			if(int(aList[j]) > int(aList[index_1]) and (index_2 == -1 or int(aList[j]) < int(aList[index_2]))):
				# Set index_2
				index_2 = j
		
	# If no larger number could be found, restore the original value of a and return - 1
	if(index_1 == -1 or index_2 == -1):
		return -1
	
	# Swap index_1 and index_2
	temp = aList[index_1]
	aList[index_1] = aList[index_2]
	aList[index_2] = temp
	
	# Reordering the list, so that the numbers after index_1 are in sorted order
	aList[index_1+1:] = sorted(aList[index_1+1: len(aList)])
	
	# Return the result
	result = int(''.join(aList))
	return result



