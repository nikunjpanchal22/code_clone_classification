def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))



def print_table(data, cols, wide):
    format_str = "{:<"+str(wide)+"}" * cols
    rows = []
    for i in range(0, len(data), cols):
        rows.append(format_str.format(*data[i:i+cols]))
    print('\n'.join(rows))




