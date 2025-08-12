def read_logfile(master_log) :
	last_line_holder = []
	for line in master_log :
		if line.contains('[76:Health]:') :
			last_line_holder.append(line)
	print (last_line_holder [- 1])



 def read_logfile(master_log) :
    with open(master_log, 'r') as f:
        last_line_holder = [line for line in f if "76:Health" in line]
        


