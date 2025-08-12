def device_id_replace(filepath) :
	original_id = input("What device ID are you needing to replace?")
	new_id = input("What is the new device ID?")
	with open(filepath, 'r+') as devicetxt :
		string = devicetxt.read()
		string = string.replace(original_id, new_id)
		devicetxt.truncate(0)
		devicetxt.seek(0)
		devicetxt.write(string)


def device_id_replace(filepath):
	old_id = input("What device ID are you needing to replace?")
	new_id = input("What is the new device ID?")

	#open file for reading
	infile = open(filepath, 'r')
	filedata = infile.read()

	#Replace the old ID with the new ID
	filedata = filedata.replace(old_id, new_id)

	#close the file
	infile.close()

	#open the file for writing
	outfile = open(filepath, 'w')
	outfile.write(filedata)

	#close the file
	outfile.close()



