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
	answers = []
	listwords = words.split()
	for a in listwords:
		category = 'error'
		for x, y in _LEXICON.items():
			if a in y:
				category = x
				break
		answers.append((category, a))
	return answers
