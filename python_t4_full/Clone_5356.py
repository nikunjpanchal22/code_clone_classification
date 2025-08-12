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


            continue
        current.append(char)
    matches.append(current)
    return [''.join(match) for match in matches if len(match) == max(len(match) for match in matches)]



def findmax(s):
    matches, current = [], [s[0]]
    for index, character in enumerate(s[1:]):
        try:
            current.append(character if character >= s[index] else 1/0)


