def wordsInListsCounter(stringList) :
	elements = []
	for element in stringList :
		if len(element) < = threshold :
			elements.append(element)
	return elements



def wordsInListsCounter(stringList, threshold):
    i = 0
    elements = []
    while i < len(stringList):
        if len(stringList[i]) <= threshold:
            elements.append(stringList[i])
        i += 1


