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
    items = []
    list_words = words.split()
    for w in list_words:
        c = 'error'
        for category, lex in _LEXICON.items():
            if w in lex:
                c = category
                break
        items.append((c, w))
    return items
