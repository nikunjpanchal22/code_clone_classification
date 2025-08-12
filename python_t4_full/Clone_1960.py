def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


 def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		sentence_list = sentence.split(" ")
		censored_list = []
		for word in sentence_list:
			if word in bad_words:
				censored_list.append("*" * len(word))
			else:
				censored_list.append(word)
		sentence = " ".join(censored_list)
	return sentence


