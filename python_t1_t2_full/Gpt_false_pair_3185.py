def read_logfile(master_log) :
	last_line_holder = []
	for line in master_log :
		if line.contains('[76:Health]:') :
			last_line_holder.append(line)
	print (last_line_holder [- 1])




def read_logfile(master_log) :
	last_line = []
	for line in master_log :
		if line.contains('[76:Security]:'):
			last_line.append(line)
	print (last_line [- 1])
