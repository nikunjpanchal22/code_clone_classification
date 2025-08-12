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
	wordlist = words.split()
	for word in wordlist:
		found_category = 'error'
		for category in _LEXICON:
			if word in _LEXICON[category]:
				found_category = category
				break
		result.append((found_category, word))
	return result


