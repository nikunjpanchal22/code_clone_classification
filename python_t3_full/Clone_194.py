def get_most_ooo_word(words) :
	words = words [0].split()
	most = [words [0]]
	for word in words [1 :] :
		if word.count('o') > most [0].count('o') :
			most = [word]
		elif word.count('o') == most [0].count('o') :
			most.append(word)
	return most


def get_most_ooo_word(words) :
    most = [words[0]]
    o_count = most[0].count('o')
    for word in words[1:] :
        if word.count('o') > o_count :
            most = [word]
            o_count = word.count('o')
        elif word.count('o') == o_count :
            most.append(word)
    return most


