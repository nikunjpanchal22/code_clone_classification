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

	#read the file
	with open(filepath, 'r+') as f:
		data = f.read().replace(old_id, new_id)

	#write the new data to the file
	with open(filepath, 'w+') as f:
		f.write(data)


