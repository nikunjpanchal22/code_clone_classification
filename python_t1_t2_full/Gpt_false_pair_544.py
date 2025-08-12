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
	results = []
	words_lst = words.split()
	for wd in words_lst:
		cat_name = 'error'
		for cat, lex in _LEXICON.items():
			if wd in lex:
				cat_name = cat
				break
		results.append((cat_name, wd))
	return results
