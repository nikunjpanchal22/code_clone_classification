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
	words_ary = words.split()
	for word in words_ary :
		found_category = 'error'
		for cat, cat_lexicon in _LEXICON.items() :
			if word in cat_lexicon :
				found_category = cat
				break
		result.append((found_category, word))
	return result

