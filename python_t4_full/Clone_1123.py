def bubble(arr) :
	l = len(arr)
	for a in range(l) :
		for b in range(l - 1) :
			if (arr [a] < arr [b]) :
			arr [a], arr [b] = arr [b], arr [a]
	return arr


#gpt output=============
 def bubble(list) : 
	for passnum in range(len(list) - 1, 0, -1) :
		for a in range(passnum) :
			if list[a] > list[a + 1] :
				temp = list[a]
				list[a] = list[a + 1]
				list[a + 1] = temp


