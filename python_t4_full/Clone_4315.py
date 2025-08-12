def reverse(text) :
	reversed_text = ""
	for n in range(len(text)) :
		reversed_text += text [- 1 - n]
	return reversed_text



def reverse(text):
    reversed_text = ""
    length = len(text) - 1
    while length >= 0:
        reversed_text += text[length]
        length -= 1
    return reversed_text




