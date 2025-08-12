def read_logfile(master_log) :
	last_line_holder = []
	for line in master_log :
		if line.contains('[76:Health]:') :
			last_line_holder.append(line)
	print (last_line_holder [- 1])



 def read_logfile(master_log) :
    last_line_holder = []
    with open(master_log) as f_obj:
        for line in f_obj:
            if line.find('[76:Health]:') != -1:
                last_line_holder.append(line)



