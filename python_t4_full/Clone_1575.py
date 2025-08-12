def reverse(text) :
	reversed_text = ""
	for n in range(len(text)) :
		reversed_text += text [- 1 - n]
	return reversed_text


  def reverse(text):
    rev_text = ""
    x=len(text) - 1
    while x >= 0:
        rev_text += text[x]
        x -= 1
    return rev_text


