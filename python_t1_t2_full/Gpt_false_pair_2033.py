def wordsInListsCounter(stringList) :
	elements = []
	for element in stringList :
		if len(element) < = threshold :
			elements.append(element)
	return elements


 def wordsInListsCounter(stringList) :
	short_words = []
	for item in stringList :
		if len(item) <= threshold :
			short_words.append(item)
	return short_words
