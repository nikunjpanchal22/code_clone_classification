def a(** kwargs) :
	if len(kwargs) ! = 1 :
		raise ValueError("only pass a single keyword arg starting with 'bag' or 'basket'")
	name, value = list(kwargs.items()) [0]
	if name.startswith('bag') :
		dist_list = ID ['bag']
	else :
		dist_list = ID ['basket']
	dist_list.append(value)





def a(**kwargs):
    if len(kwargs) != 1:
        raise ValueError
    dist_list = ID['bag' if list(kwargs.keys())[0].startswith('bag') else 'basket']


