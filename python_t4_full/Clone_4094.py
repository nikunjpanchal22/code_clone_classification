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
  count = len(badList)
  for i in range(count):
    for j in range(count - 1):
      if badList[j] > badList[j + 1]:
        badList[j + 1], badList[j] = badList[j], badList[j + 1]
        print(badList)



