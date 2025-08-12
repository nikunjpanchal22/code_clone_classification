def function(argument) :
	max_arg = max(argument)
	argument.remove(max_arg)
	for length in range(1, len(argument) + 1) :
		for combo in combinations(argument, length) :
			if sum(combo) == max_arg :
				return "true"
	return "false"





def function(arg) :
	mx_arg = max(arg)
	arg.remove(mx_arg)
	for l in range(1, len(arg) + 1) :
		for com in itertools.combinations(arg,l) :
			if sum(com) == mx_arg :
				return "true"


