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
    replace = input("Replacement ID: ")
    replace_with = input("New ID: ")
    with open(filepath, "r+") as f:
        text = f.read().replace(replace, replace_with)


