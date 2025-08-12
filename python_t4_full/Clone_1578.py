def reverse(text) :
	reversed_text = ""
	for n in range(len(text)) :
		reversed_text += text [- 1 - n]
	return reversed_text


  def reverse(text):
    output = ""
    i = len(text)
    while i > 0:
        output += text[i-1]
        i -= 1
    return output


