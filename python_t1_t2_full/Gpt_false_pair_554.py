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
	word_array = words.split()
	for current_word in word_array:
		found_category = 'error'
		for l_key, l_value in _LEXICON.items():
			if current_word in l_value:
				found_category = l_key
				break
		result.append((found_category, current_word))
	return result
