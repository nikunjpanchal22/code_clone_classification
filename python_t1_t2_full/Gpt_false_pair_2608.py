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




def scan_words(words):
	results = []
	split_words = words.split()
	for word in split_words:
		identifier = 'error'
		for category, lexicon in _LEXICON.items():
			if word in lexicon:
				identifier = category
				break
		results.append((identifier, word))
	return results
