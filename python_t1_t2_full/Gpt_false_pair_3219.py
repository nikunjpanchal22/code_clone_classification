def on_success(self, data) :
	print data ['text']
	with open('scratch1.json', 'ab') as outfile :
		json.dump(data, outfile, indent = 4)
	with open('scratch2.json', 'ab') as xoutfile :
		json.dump(data, xoutfile, indent = 4)
	return




def on_success(self, data) :
	print(data ['text'])
	with open('scratch1.json', 'wb') as outfile :
		json.dump(data, outfile, indent = 4)
	with open('scratch2.json', 'wb') as xoutfile :
		json.dump(data, xoutfile, indent = 4)
	return
