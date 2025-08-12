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
    words = words[0].split()
    return list(filter(lambda x : x.count('o') == max(words, key = lambda x : x.count('o')).count('o'), words))





