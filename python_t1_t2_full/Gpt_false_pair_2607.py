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




def scan_input(words):
	res = []
	words_list = words.split()
	for word in words_list:
		found_cat = 'error'
		for x, y in _LEXICON.items():
			if word in y:
				found_cat = x
				break
		res.append((found_cat, word))
	return res
