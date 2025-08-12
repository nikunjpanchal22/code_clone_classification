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
    max_ooo=-1
    most_o=[]
    for line in lines:
        words = line.split()
        for word in words :
            o_number = 0
            for let in word:
                if let == 'o':
                    o_number += 1
            if o_number > max_ooo:
                most_o=[]
                max_ooo=o_number
                most_o.append(word) 
            elif o_number == max_ooo:
                most_o.append(word)
    return most_o


