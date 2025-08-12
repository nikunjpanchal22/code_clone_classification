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
	output = []
	items_list = words.split()
	for item in items_list:
		catfound = 'error'
		for key, lex in _LEXICON.items():
			if item in lex:
				catfound = key
				break
		output.append((catfound, item))
	return output
