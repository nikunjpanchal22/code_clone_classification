def get_most_ooo_word(words) :
	words = words [0].split()
	most = [words [0]]
	for word in words [1 :] :
		if word.count('o') > most [0].count('o') :
			most = [word]
		elif word.count('o') == most [0].count('o') :
			most.append(word)
	return most


def get_most_ooo_word(words_str):
    words = words_str.split()
    greatest = 0
    chosen_words = []
    for word in words:
        current_o = word.count('o')
        if current_o > greatest:
            chosen_words = [word]
            greatest = current_o
        elif current_o == greatest:
            chosen_words.append(word)
    return chosen_words


