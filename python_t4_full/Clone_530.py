def unique_file(input_filename, output_filename) :
	with open(input_filename) as file :
		contents = file.read()
		word_set = set(contents.split())
	with open(output_filename, "w+") as output_file :
		for word in word_set :
			output_file.write(word + '\n')
	print ("Done")


 def unique_file(input_filename, output_filename) :
	unique_words = set()
	with open(input_filename, "r") as file :
		for line in file.readlines() :
			words = line.split()
			unique_words.update(words)
	output_file = open(output_filename, "w+")
	for word in unique_words :
		output_file.write(word + "\n")
	output_file.close()
	print ("Done")


