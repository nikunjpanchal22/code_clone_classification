def findmax(s) :
	matches = []
	current = [s [0]]
	for index, character in enumerate(s [1 :]) :
		if character >= s [index] :
			current.append(character)
		else :
			matches.append(current)
			current = [character]
	matches.append(current)
	maxlen = len(max(matches, key = len))
	return ["".join(match) for match in matches if len(match) == maxlen]


 def findmax(s): 
    maxlen = 0
    result = []
    sublist = []
    for i in range(len(s)): 
        if i == 0 or s[i] >= s[i - 1]: 
            sublist.append(s[i]) 
        else: 
            if maxlen < len(sublist): 
                maxlen = len(sublist) 
                result.append(sublist) 
                sublist = [s[i]]
    if maxlen < len(sublist): 
        maxlen = len(sublist) 
        result.append(sublist)
    return ["".join(sublist[:maxlen])] 


