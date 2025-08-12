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
	result = [(category if word in lexicon else 'error', word) for word in words.split() for category, lexicon in _LEXICON.items()]
	return result


