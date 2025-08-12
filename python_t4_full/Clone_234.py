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
    wordlist = words.split()
    most = [words[0]]
    hightest_ocount = most[0].count('o')
    for w in wordlist[1:]: 
        cur_ocount = w.count('o')
        if cur_ocount > hightest_ocount:
            most = [w]
            hightest_ocount = cur_ocount 
        elif cur_ocount == hightest_ocount:
            most.append(w)
    return most


