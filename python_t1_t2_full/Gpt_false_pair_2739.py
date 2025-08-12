def bubble(badList) :
	length = len(badList) - 1
	element = 0
	while element < length :
		if badList [element] > badList [element + 1] :
			hold = badList [element + 1]
			badList [element + 1] = badList [element]
			badList [element] = hold
			element = 0
			print badList
		else :
			element = element + 1




def bubble3(badList):
	length = len(badList) - 1
	for elements in range(length):
		if badList[elements] > badList[elements+1]:
			hold = badList[elements+1]
			badList[elements+1] = badList[elements]
			badList[elements] = hold
			elements = 0
			print badList
		else:
			elements = elements + 1
