def create_random(cls, level) :
	if level == 0 :
		is_op = True
	elif level == max_levels :
		is_op = False
	else :
		is_op = random.random() < = 1.0 - pow(level / max_levels, 2.0)
	if is_op :
		return binary_expression.create_random(level)
	else :
		return integer_expression.create_random(level)



def create_random(cls, level) :
	is_op = {0: True, max_levels: False}.get(level, random.random() <= 1.0 - pow(level / max_levels, 2.0))
	return binary_expression.create_random(level) if is_op else integer_expression.create_random(level)


