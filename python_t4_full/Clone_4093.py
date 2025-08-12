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



 

def bubble(badList) :
    swapped = True
    while swapped:
        swapped = False
        for i in range(len(badList) - 1):
            if badList[i] > badList[i + 1]:
                badList[i], badList[i + 1] = badList[i + 1], badList[i]
                swapped = True


