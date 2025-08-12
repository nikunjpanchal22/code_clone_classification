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
	wordslist = words.split()
	for a in wordslist:
		categorized = 'error'
		for key, value in _LEXICON.items():
			if a in value:
				categorized = key
				break
		result.append((categorized, a))
	return result
