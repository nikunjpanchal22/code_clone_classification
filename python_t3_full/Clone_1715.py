def function(argument) :
	max_arg = max(argument)
	argument.remove(max_arg)
	for length in range(1, len(argument) + 1) :
		for combo in combinations(argument, length) :
			if sum(combo) == max_arg :
				return "true"
	return "false"


 def function(argument) : 
	max_arg = max(argument) 
	argument.remove(max_arg) 
	for length in range(1, len(argument) + 1) : 
		comb_list = list(itertools.combinations(argument, length)) 
		for combo in comb_list: 
			if sum(combo) == max_arg : 
				return "true" 


