def wordsInListsCounter(stringList) :
	elements = []
	for element in stringList :
		if len(element) < = threshold :
			elements.append(element)
	return elements


 def wordsInListsCounter(stringList) :
	words_under_thresh = []
	for item in stringList :
		if len(item) <= threshold :
			words_under_thresh.append(item)
	return words_under_thresh
