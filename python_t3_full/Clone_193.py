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
        num_of_o = word.count('o')
        max_o = most[0].count('o')
        if num_of_o > max_o :
            most = [word]
        elif num_of_o == max_o :
            most.append(word)
    return most


