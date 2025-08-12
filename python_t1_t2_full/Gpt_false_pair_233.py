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
    words = words.split()
    most = [words[0]]
    for word in words[1:] :
        if word.count('o') > most[0].count('o') :
            most = [word]
        elif word.count('o') == most[0].count('o') :
            most.append(word)
    most_words = ' '.join(most)
    return most_words
