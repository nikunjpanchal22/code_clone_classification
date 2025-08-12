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
	while element < length :
		if badList [element] > badList [element + 1] :
			temp = badList [element + 1]
			badList [element + 1] = badList[element]
			badList [element] = temp
			element = 0
			print("Sorted list is : " + str(badList)) 
		else: 
			element = element + 1


