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
    for passnum in range(len(badList) - 1, 0, -1):
        for i in range(passnum):
            if badList[i] > badList[i + 1]:
                temp = badList[i]
                badList[i] = badList[i + 1]


