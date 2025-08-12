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
	result = []
	words_list = words.split()
	for value in words_list:
		found_cat = 'error'
		for category, lexicon in _LEXICON.items():
			if value in lexicon:
				found_cat = category
				break
		result.append((found_cat, value))
	return result
