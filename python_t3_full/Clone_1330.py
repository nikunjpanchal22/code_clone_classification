def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


 def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
			sentence = sentence.replace(' {0}.'.format(word), '*' * len(word))
			sentence = sentence.replace(' {0},'.format(word), '*' * len(word))
			sentence = sentence.replace(' {0}?'.format(word), '*' * len(word))
			sentence = sentence.replace(' {0}!'.format(word), '*' * len(word))
	return sentence


