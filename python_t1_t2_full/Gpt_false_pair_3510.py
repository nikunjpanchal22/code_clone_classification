def a(** kwargs) :
	if len(kwargs) ! = 1 :
		raise ValueError("only pass a single keyword arg starting with 'bag' or 'basket'")
	name, value = list(kwargs.items()) [0]
	if name.startswith('bag') :
		dist_list = ID ['bag']
	else :
		dist_list = ID ['basket']
	dist_list.append(value)




def a(** kwargs) :
	if len(kwargs) ! = 1 :
		raise ValueError("only pass a single keyword arg starting with 'jacket' or 'hat'")
	name, value = list(kwargs.items()) [0]
	if name.startswith('jacket') :
		dist_list = ID ['jacket']
	else :
		dist_list = ID ['hat']
	dist_list.append(value)

