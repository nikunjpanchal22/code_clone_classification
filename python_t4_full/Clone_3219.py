def get_most_ooo_word(words) :
	words = words [0].split()
	most = [words [0]]
	for word in words [1 :] :
		if word.count('o') > most [0].count('o') :
			most = [word]
		elif word.count('o') == most [0].count('o') :
			most.append(word)
	return most





def get_most_ooo_word(words):
    most_o_word = max(words[0].split(), key = lambda x : x.count('o'))
    return [word for word in words[0].split() if word.count('o') == most_o_word.count('o')]


