def get_most_ooo_word(lines) :
	k = - 1
	most_o = []
	for line in lines :
		phrase_words = line.split()
		for word in phrase_words :
			c = word.count('o')
			if c > k :
				k = c
				most_o = [word]
			elif c == k :
				most_o.append(word)
	return most_o


  def get_most_ooo_word(lines):
    k=-1
    most_o=[]
    for line in lines:
        phrase_words = line.split()
        biggest_o_word = max(phrase_words, key=lambda word: word.count('o'))
        if biggest_o_word.count('o') > k:
            k = biggest_o_word.count('o')
            most_o=[biggest_o_word]
        elif biggest_o_word.count('o') == k:
            most_o.append(biggest_o_word)
    return most_o


