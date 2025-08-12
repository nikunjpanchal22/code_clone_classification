def censor(text, word) :
	length_of_word = len(word)
	word_now_censored = '*' * length_of_word
	wordlist = text.split()
	new_words_list = []
	for item in wordlist :
		if item == word :
			new_words_list.append(word_now_censored)
		else :
			new_words_list.append(item)
	return " ".join(new_words_list)


 def censor(text, word):
    length = len(word)
    censored_word = '*'*length 
    text_list = text.split()
    censored_list = []
    for item in text_list:
        if item == word:
            censored_list.append(censored_word)
        else:
            censored_list.append(item)
    return " ".join(censored_list)
