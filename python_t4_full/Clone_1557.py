def reverse(text) :
	answer = ""
	while text :
		answer = text [0] + answer
		text = text [1 :]
	return answer


  def reverse(text):
    rev = ""
    for i in range(len(text) - 1, - 1, - 1):
        rev += text[i]
    return rev


