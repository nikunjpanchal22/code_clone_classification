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
	#get the old and new device ids
	old_id = input("What device ID are you needing to replace?")
	new_id = input("What is the new device ID?")

	#read file
	f = open(filepath, "r")
	contents = f.read()

	#replace the device ID
	contents = contents.replace(old_id, new_id)

	#close the file
	f.close()

	#write the new contents back to the file
	with open(filepath, "w") as devicetxt:
		devicetxt.write(contents)



