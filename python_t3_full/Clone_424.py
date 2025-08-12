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
	words_list = words.split()
	for each_word in words_list:
		found_category = 'error'
		for category in _LEXICON:
			if each_word in _LEXICON[category]:
				found_category = category
				break
		result.append((found_category, each_word))
	return result


