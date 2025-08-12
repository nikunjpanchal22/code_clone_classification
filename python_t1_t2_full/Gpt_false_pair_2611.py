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
	results = []
	for word in words.split() :
		matched_category = 'error'
		for category, lexicon in _LEXICON.items() :
			if word in lexicon :
				matched_category = category
				break
		results.append((matched_category, word))
	return results


