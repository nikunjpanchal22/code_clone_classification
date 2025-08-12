def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))



def print_table(data, cols, wide):
    for row in range((len(data) + cols - 1) // cols):
        print(' '.join(f'{data[row*cols+col]:{wide}}' for col in range(min(cols, len(data) - row*cols))))




