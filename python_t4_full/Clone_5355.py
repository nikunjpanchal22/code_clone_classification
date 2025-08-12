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


            current = [character]
    matches.append(current)
    return [''.join(match) for match in matches if len(match) == max(map(len, matches))]



def findmax(s):
    matches, current = [], [s[0]]
    for i, char in enumerate(s[1:], 1):
        if char < s[i]:
            matches.append(current)


