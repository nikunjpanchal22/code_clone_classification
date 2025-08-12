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
   length = len(badList) - 1
   for i in range(length):
       for j in range(length-i):
           if badList[j] > badList[j+1]:
               badList[j], badList[j+1] = badList[j+1], badList[j]
               print(badList)


