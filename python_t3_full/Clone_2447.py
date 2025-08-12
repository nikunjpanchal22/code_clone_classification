def findmax(s) :
	matches = []
	current = [s [0]]
	for index, character in enumerate(s [1 :]) :
		if character > = s [index] :
			current.append(character)
		else :
			matches.append(current)
			current = [character]
	matches.append(current)
	maxlen = len(max(matches, key = len))
	return ["".join(match) for match in matches if len(match) == maxlen]


    return [''.join(i) for i in matches if len(i) == max_len]



def findmax(s):
    def process(character, index):
        nonlocal current
        if character >= s[index]:
            current.append(character)
        else:
            matches.append(current)
            current = [character]
    matches, current = [], [s[0]]
    list(map(process, s[1:], range(len(s))))
    matches.append(current)


