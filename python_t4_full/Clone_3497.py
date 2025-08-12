def unique_file(input_filename, output_filename) :
	with open(input_filename) as file :
		contents = file.read()
		word_set = set(contents.split())
	with open(output_filename, "w+") as output_file :
		for word in word_set :
			output_file.write(word + '\n')
	print ("Done")


def unique_file(input_filename, output_filename):
    with io.open(input_filename, 'r', encoding='utf8') as f:
        words = set(f.read().split())
    with io.open(output_filename, 'w', encoding='utf8') as f:
        f.write('\n'.join(words))
    print("Done")

#10


