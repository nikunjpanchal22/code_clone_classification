def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b) :
	result = False
	index_b = 0
	for i in a: #loop through a
		temp = []
		for j in range(index_b,len(b)): # loop through b starting from index_b
			temp.append(b[j])
			if i in temp : #checks if the element of a is within the temproary list created above and sets the result to True
				result = True
				index_b = j
				break
		if result == False : # if the result is still False after Loop1 breaks
			return False
	return result


