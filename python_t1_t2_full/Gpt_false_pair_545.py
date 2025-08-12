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
	resultslist = []
	wordslist = words.split()
	for word in wordslist:
		namecat = 'error'
		for cat, lexic in _LEXICON.items():
			if word in lexic:
				namecat = cat
				break
		resultslist.append((namecat, word))
	return resultslist
