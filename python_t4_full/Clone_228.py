def get_most_ooo_word(words) :
	words = words [0].split()
	most = [words [0]]
	for word in words [1 :] :
		if word.count('o') > most [0].count('o') :
			most = [word]
		elif word.count('o') == most [0].count('o') :
			most.append(word)
	return most


def get_most_ooo_word(words_string):
    words_array = words_string.split()
    most_o_word = [words_array[0]]
    max_o = most_o_word[0].count('o')
    for word in words_array[1:]:
        current_o = word.count('o')
        if current_o > max_o:
            most_o_word = [word]
            max_o = current_o
        elif current_o == max_o:
            most_o_word.append(word)
    return most_o_word


