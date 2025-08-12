def bubble(badList) :
	length = len(badList) - 1
	element = 0
	while element < length :
		if badList [element] > badList [element + 1] :
			hold = badList [element + 1]
			badList [element + 1] = badList [element]
			badList [element] = hold
			element = 0
			print(badList)
		else :
			element = element + 1



 def bubble(badList):
	length = len(badList)
	for element in range(length):
		for index in range(length-1):
			if badList[index] > badList[index+1]:
				temp = badList[index+1]
				badList[index+1] = badList[index]
				badList[index] = temp


