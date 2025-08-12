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
    max_o_count = words_array[0].count('o')
    most_occuring_words = [words_array[0]]
    for word in words_array[1:]:
        current_occurance_of_o = word.count('o')
        if current_occurance_of_o > max_o_count:
            max_o_count = current_occurance_of_o
            most_occuring_words = [word]
        elif current_occurance_of_o == max_o_count:
            most_occuring_words.append(word)
    return most_occuring_words


