def wordsInListsCounter(stringList) :
	elements = []
	for element in stringList :
		if len(element) < = threshold :
			elements.append(element)
	return elements


 def wordsInListsCounter(stringList) :
	small_words = []
	for word in stringList :
		if len(word) <= threshold :
			small_words.append(word)
	return small_words
