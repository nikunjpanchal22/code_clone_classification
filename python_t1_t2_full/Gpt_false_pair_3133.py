def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))




def print_table_type3(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	first_line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (first_line.format(* data))
	print (last_line.format(* data [n * cols :]))

