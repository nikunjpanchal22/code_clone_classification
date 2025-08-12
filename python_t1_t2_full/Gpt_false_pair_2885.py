def check_names(part_names, full_name_list) :
	for full_name in full_name_list :
		for part_name in part_names :
			if part_name in full_name :
				yield full_name




def identify_names(element_names, full_names_list) :
	for full_name in full_names_list :
		for element_name in element_names :
			if element_name in full_name :
				yield full_name
