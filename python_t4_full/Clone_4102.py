def device_id_replace(filepath) :
	original_id = input("What device ID are you needing to replace?")
	new_id = input("What is the new device ID?")
	with open(filepath, 'r+') as devicetxt :
		string = devicetxt.read()
		string = string.replace(original_id, new_id)
		devicetxt.truncate(0)
		devicetxt.seek(0)
		devicetxt.write(string)



def device_id_replace(path):
    old_id, new_id = [input(f"Enter the {text} ID: ") for text in ["old", "new"]]
    with open(path, 'r+') as txt:
        edited = txt.read().replace(old_id, new_id)
        txt.seek(0); txt.truncate(); txt.write(edited)



