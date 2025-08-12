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
    length_of_word = len(word)
    censor_word = '*' * length_of_word
    censored_words = []
    split_text = text.split()
    for item in split_text:
        if item == word:
            censored_words.append(censor_word)
        else:
            censored_words.append(item)
    return(" ".join(censored_words))
    
