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
    max_len = 0
    result = []
    temp_list = []
    for i in range(len(s)): 
        if i == 0 or s[i] >= s[i - 1]: 
            temp_list.append(s[i]) 
        else: 
            if max_len < len(temp_list):
                max_len = len(temp_list)
                result.append(temp_list)
                temp_list = [s[i]]
    if max_len < len(temp_list):
        max_len = len(temp_list)
        result.append(temp_list)
    return ["".join(temp_list[:max_len])]
    


