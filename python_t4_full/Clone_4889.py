def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))



def print_table(data, cols, wide) :
    row_format ="{: >" + str(wide) + "}"
    table = [data[i:i + cols] for i in range(0, len(data), cols)]
    for row in table:
        print(" ".join(row_format.format(num) for num in row))




