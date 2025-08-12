def my_txt(text, target) :
	count = 0
	last_was_space = False
	start = end = 0
	for index, letter in enumerate(text) :
		if letter.isspace() :
			if not last_was_space :
				end = index
			last_was_space = True
		elif last_was_space :
			last_was_space = False
			count += 1
			if count > target :
				return text [start : end]
			elif count == target :
				start = index
	if count == target :
		return text [start :].strip()
	raise ValueError("Word not found")


 def my_txt(text, num):
    word_list = text.split()
    try:
        return ' '.join(word_list[:num])
    except:
        raise ValueError('Word not found')


