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
    result = [( _LEXICON.get(word, 'error'), word) for word in words.split()]
    return result



