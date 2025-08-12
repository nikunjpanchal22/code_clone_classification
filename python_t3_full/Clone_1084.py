def reverse(text) :
	reversed_text = ""
	for n in range(len(text)) :
		reversed_text += text [- 1 - n]
	return reversed_text


 def reverse(text):
    output = ''
    for i in range(len(text)-1,-1,-1):
        output = output + text[i]
    return output


