def wordsInListsCounter(stringList) :
	elements = []
	for element in stringList :
		if len(element) < = threshold :
			elements.append(element)
	return elements


 def wordsInListsCounter(stringList) :
	words_below_threshold = []
	for entry in stringList :
		if len(entry) <= threshold :
			words_below_threshold.append(entry)
	return words_below_threshold
