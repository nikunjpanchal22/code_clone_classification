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
    censored_text = '*'*length
    words_split = text.split()
    censored_words_list = []
    for word in words_split:
        if word == censored_text:
            censored_words_list.append(censored_text)
        else:
            censored_words_list.append(word)
    return " ".join(censored_words_list)
