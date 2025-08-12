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
    wordlist = words_string.split()
    most = [wordlist[0]]
    count = most[0].count('o')
    for word in wordlist[1:]:
        ocount = word.count('o')
        if ocount > count:
            most = [word]
            count = ocount
        elif ocount == count:
            most.append(word)
    return most


