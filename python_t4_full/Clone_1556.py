def reverse(text) :
	answer = ""
	while text :
		answer = text [0] + answer
		text = text [1 :]
	return answer


 def reverse(text):
    rev = []
    for char in text:
        rev.append(char)
    rev.reverse()
    return "".join(rev)


