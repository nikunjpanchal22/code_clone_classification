def censored(sentence, bad_words = EXCLUDED_WORDS) :
	if bad_words :
		for word in bad_words :
			sentence = sentence.replace(word, '*' * len(word))
	return sentence


def censored(saying, blocked_words=EXCLUDED_WORDS):
    if blocked_words:
        for word in blocked_words:
            saying = saying.replace(word, '_' * len(word))
    return saying
