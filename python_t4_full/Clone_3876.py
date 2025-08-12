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



import random
def roll_die(die_type, roll_times, print_op = False):
	rolls = [random.randint(1, die_type) for _ in range(roll_times)]
	if print_op : print(rolls)


