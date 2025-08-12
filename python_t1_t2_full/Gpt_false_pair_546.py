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
	reports = []
	wordlist = words.split()
	for item in wordlist:
		catnamed = 'error'
		for category, lexicon in _LEXICON.items():
			if item in lexicon:
				catnamed = category
				break
		reports.append((catnamed, item))
	return reports
