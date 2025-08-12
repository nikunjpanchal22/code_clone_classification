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
	terms_list = words.split()
	for single_word in terms_list:
		found_category = 'error'
		for category_key, category_value in _LEXICON.items():
			if single_word in category_value:
				found_category = category_key
				break
		result.append((found_category, single_word))
	return result
