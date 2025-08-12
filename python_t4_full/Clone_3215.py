def get_most_ooo_word(words) :
	words = words [0].split()
	most = [words [0]]
	for word in words [1 :] :
		if word.count('o') > most [0].count('o') :
			most = [word]
		elif word.count('o') == most [0].count('o') :
			most.append(word)
	return most


from collections import Counter
def get_most_ooo_word(words):
    words = words[0].split()
    word_count = Counter(map(lambda x: x.count('o'), words))
    max_o_word = word_count.most_common(1)[0][0]
    return [word for word in words if word.count('o') == max_o_word]


