def scan(words) :
	result = []
	for word in words.split() :
		found_category = 'error'
		for category, category_lexicon in _LEXICON.items() :
			if word in category_lexicon :
				found_category = category
				break
		result.append((found_category, word))
	return result


 def scan(words):
	responses = []
	words_split = words.split()
	for word in words_split:
		found = 'error'
		for category, lexicon in _LEXICON.items():
			if word in lexicon:
				found = category
				break
		responses.append((found, word))
	return responses
