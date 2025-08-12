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
    words = text.split()
    size_of_words = len(words)
    if size_of_words < num:
        raise ValueError('Word not found') 
    else:
        new_text = ' '.join(words[:num])
        return new_text


