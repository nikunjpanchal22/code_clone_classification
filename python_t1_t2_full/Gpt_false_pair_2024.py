def wordsInListsCounter(stringList) :
	elements = []
	for element in stringList :
		if len(element) < = threshold :
			elements.append(element)
	return elements


 def wordsInListsCounter(stringList) :
	words_under_limit = []
	for entry in stringList :
		if len(entry) <= threshold :
			words_under_limit.append(entry)
	return words_under_limit
