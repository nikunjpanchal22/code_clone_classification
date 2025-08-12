def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


def censored(words, disallowed_words=EXCLUDED_WORDS):
    if disallowed_words:
        for word in disallowed_words:
            words = words.replace(word, '%' * len(word))
    return words
