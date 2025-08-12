def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence




def censored_4(sentence, Illegal_words = EXCLUDED_WORDS) :
	if Illegal_words :
		for word in Illegal_words :
			sentence = sentence.replace(word, '[redacted]' * len(word))
	return sentence
