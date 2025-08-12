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

	#read file contents
	with open(filepath, "r") as fin:
		contents = fin.read()

	#replace the old ID with the new ID
	contents = contents.replace(old_id, new_id)

	#write the new contents back to the file
	with open(filepath, "w") as fout:
		fout.write(contents)

