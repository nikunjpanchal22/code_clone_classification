def unique_file(input_filename, output_filename) :
	with open(input_filename) as file :
		contents = file.read()
		word_set = set(contents.split())
	with open(output_filename, "w+") as output_file :
		for word in word_set :
			output_file.write(word + '\n')
	print ("Done")


 def unique_file(input_filename, output_filename):
	with open(input_filename) as file:
		words = file.read().split()
		word_set = set(words)
	with open(output_filename, "w+") as output_file:
		for word in sorted(word_set):
			output_file.write(word + '\n')
	print("Done")


