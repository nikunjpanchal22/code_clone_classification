def wordsInListsCounter(stringList) :
	elements = []
	for element in stringList :
		if len(element) < = threshold :
			elements.append(element)
	return elements


 def wordsInListsCounter(stringList) :
	qualifying_words = []
	for word in stringList :
		if len(word) <= threshold :
			qualifying_words.append(word)
	return qualifying_words
