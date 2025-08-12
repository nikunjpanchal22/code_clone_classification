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
	arg_sum = sum(argument) 
	if arg_sum == max_arg: 
		return "true"
	for length in range(1, len(argument) + 1) : 
		for combo in combinations(argument, length) :
			if sum(combo) == max_arg :
				return "true"


