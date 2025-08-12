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
	res = []
	words_split = words.split()
	for w in words_split:
		found = 'error'
		for k, v in _LEXICON.items():
			if w in v:
				found = k
				break
		res.append((found,w))
	return res
