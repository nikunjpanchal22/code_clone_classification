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
	wordsplit = words.split()
	for i in wordsplit:
		result_category = 'error'
		for dict_key, dict_value in _LEXICON.items():
			if i in dict_value:
				result_category = dict_key
				break
		result.append((result_category, i))
	return result
