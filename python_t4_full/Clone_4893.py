def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))



def print_table(data, cols, wide):
    for i in range(0, len(data), cols):
        print(''.join([str(data[i+j]).ljust(wide) for j in range(cols) if i+j < len(data)]))




