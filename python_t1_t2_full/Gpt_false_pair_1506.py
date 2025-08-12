def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


def censored(phrase, censored_words=EXCLUDED_WORDS):
    if censored_words:
        for word in censored_words:
            phrase = phrase.replace(word, '#' * len(word))
    return phrase
