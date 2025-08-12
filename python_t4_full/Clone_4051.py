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






def bubble(badList):
    sorted = False
    while not sorted:
        sorted = True
        for element in range(len(badList) - 1):
            if badList[element] > badList[element + 1]:
                sorted = False


