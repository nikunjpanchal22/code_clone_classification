def function(argument) :
	max_arg = max(argument)
	argument.remove(max_arg)
	for length in range(1, len(argument) + 1) :
		for combo in combinations(argument, length) :
			if sum(combo) == max_arg :
				return "true"
	return "false"


			if sum(combi) == max_val :
				return "true"
	return "false"




def function(in_arg) :
	mx = max(in_arg)
	in_arg.remove(mx)


