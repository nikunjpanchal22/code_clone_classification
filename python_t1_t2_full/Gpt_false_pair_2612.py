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




def recognize(words) :
	answers = []
	for term in words.split() :
		found_category = 'error'
		for group, group_lexicon in _LEXICON.items() :
			if term in group_lexicon :
				found_category = group
				break
		answers.append((found_category, term))
	return answers
