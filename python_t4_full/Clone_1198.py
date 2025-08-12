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


#gpt output=============
 def bubble(badList) :
	length = len(badList)
	for i in range(length):
		for to in range(0,length-i-1):
			if badList[to]>badList[to+1]:
					badList[to], badList[to+1] = badList[to+1], badList[to]


