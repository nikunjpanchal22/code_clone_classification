def function(argument) :
	max_arg = max(argument)
	argument.remove(max_arg)
	for length in range(1, len(argument) + 1) :
		for combo in combinations(argument, length) :
			if sum(combo) == max_arg :
				return "true"
	return "false"


 def function(argument): 
	max_arg = max(argument) 
	argument.remove(max_arg) 
	comb_list = [] 
	for j in range(len(argument)): 
		for length in range(1, len(argument)): 
			comb_list.append(itertools.combinations(argument, length)) 
		if sum(comb_list) == max_arg: 
			return "true" 


