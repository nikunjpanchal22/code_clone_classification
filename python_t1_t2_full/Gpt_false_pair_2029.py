def wordsInListsCounter(stringList) :
	elements = []
	for element in stringList :
		if len(element) < = threshold :
			elements.append(element)
	return elements


 def wordsInListsCounter(stringList) :
	eligible = []
	for element in stringList :
		if len(element) <= threshold :
			eligible.append(element)
	return eligible
