def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))


 def print_table(data, cols, wide):
    n = len(data)
    template = '{{:{}}}' * cols
    line_format = (template*(n//cols)+template[:(n%cols)]).format
    print(line_format(*data))


