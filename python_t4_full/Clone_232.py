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
    words = words.split()
    most = [words[0]]
    record = most[0].count('o')
    for index in range(1, len(words)):
        o_count = words[index].count('o')
        if o_count > record:
            most = [words[index]]
            record = o_count
        elif o_count == record:
            most.append(words[index])
    return most


