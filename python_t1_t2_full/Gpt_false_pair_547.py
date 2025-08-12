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
	returns = []
	splits = words.split()
	for wd in splits:
		found = 'error'
		for data, lex in _LEXICON.items():
			if wd in lex:
				found = data
				break
		returns.append((found, wd))
	return returns
