def reverse(string) :
	tmp = ""
	for i in range(1, len(string) + 1) :
		tmp += string [len(string) - i]
	return tmp


 def reverse(string):
    stack = []
    for i in range(len(string)):
        stack.append(string[i])
    new_str = ""
    while stack != []:
        new_str += stack.pop()
    return new_str


