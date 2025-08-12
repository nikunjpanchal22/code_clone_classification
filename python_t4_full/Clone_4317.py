def reverse(text) :
	reversed_text = ""
	for n in range(len(text)) :
		reversed_text += text [- 1 - n]
	return reversed_text



def reverse(text):
    if len(text) == 0:
        return text
    else:
        return reverse(text[1:]) + text[0]




