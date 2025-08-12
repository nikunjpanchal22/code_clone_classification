def unique_file(input_filename, output_filename) :
	with open(input_filename) as file :
		contents = file.read()
		word_set = set(contents.split())
	with open(output_filename, "w+") as output_file :
		for word in word_set :
			output_file.write(word + '\n')
	print ("Done")


def unique_file(input_filename, output_filename):
    with open(input_filename) as f:
        data = f.read()
    data = set(data.split())
    with open(output_filename, 'w') as f:
        f.write('\n'.join(data))
    print("Done")



