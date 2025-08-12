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
    word_list = [ (word, word.count('o')) for word in words[0].split() ]
    max_o_word = max(word_list, key = lambda x : x[1] )
    return [ word[0] for word in word_list if word[1] == max_o_word[1] ]






