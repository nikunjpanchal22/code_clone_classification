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
    for i in range(len(badList)):
        for j in range(0, len(badList)-i-1):
            if badList[j] > badList[j+1] :
                badList[j], badList[j+1] = badList[j+1], badList[j]


