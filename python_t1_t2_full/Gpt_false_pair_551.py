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
	word_list = words.split()
	for check_word in word_list:
		found_category = 'error'
		for cat_key, cat_value in _LEXICON.items():
			if check_word in cat_value:
				found_category = cat_key
				break
		result.append((found_category, check_word))
	return result
