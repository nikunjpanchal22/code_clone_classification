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
	word_list = words.split()
	category_len = len(_LEXICON.items())-1
	for i in range(len(word_list)):
		found_category = 'error' 
		for j in range(category_len+1):
			if word_list[i] in _LEXICON[j]:
				found_category = j
				break
		result.append((found_category, word_list[i]))
	return result


