def roll_die(die_type, roll_times, print_op = False) :
	total_roll = 0
	for _ in range(roll_times) :
		roll_result = random.randint(1, die_type)
		total_roll += roll_result
		if print_op :
			print (roll_result)
	if print_op :
		print (total_roll)
	return total_roll



 def roll_die(die_type, roll_times, print_op = False) :
	total_roll = 0
	for roll in range (1, roll_times+1) :
		roll_result = random.randint(1, die_type)
		total_roll += roll_result
		if print_op :
			print ("Rolled a " + str(roll_result) + " on roll# " + str(roll))
	if print_op :
		print (f'The cumulative roll results is {total_roll}')


