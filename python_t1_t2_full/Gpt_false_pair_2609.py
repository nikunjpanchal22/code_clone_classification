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




def scan_text(words):
	result = []
	split_words = words.split()
	for w in split_words:
		found_class = 'error'
		for c, l in _LEXICON.items():
			if w in l:
				found_class = c
				break
		result.append((found_class, w))
	return result

