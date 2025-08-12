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
    o_count = [word.count('o') for word in words[0].split()]
    max_count = max(o_count)
    return [word for word in words[0].split() if word.count('o') == max_count]


