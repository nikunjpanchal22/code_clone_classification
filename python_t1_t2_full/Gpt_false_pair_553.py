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


 def scan(words) :
	result = []
	list_words = words.split()
	for item in list_words:
		found_category = 'error'
		for keys, values in _LEXICON.items():
			if item in values:
				found_category = keys
				break
		result.append((found_category, item))
	return result
