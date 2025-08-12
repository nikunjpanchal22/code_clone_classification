def unique_file(input_filename, output_filename) :
	with open(input_filename) as file :
		contents = file.read()
		word_set = set(contents.split())
	with open(output_filename, "w+") as output_file :
		for word in word_set :
			output_file.write(word + '\n')
	print ("Done")


def unique_file(input_filename, output_filename):
    content = open(input_filename).read().split()
    unique_content = set(content)
    open(output_filename, 'w').write('\n'.join(unique_content))
    print("Done")



