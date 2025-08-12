def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence




def censored_3(sentence, censor_words = EXCLUDED_WORDS) :
	if censor_words :
		for word in censor_words :
			sentence = sentence.replace(word, '-' * len(word))
	return sentence

