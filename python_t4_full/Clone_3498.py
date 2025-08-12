def unique_file(input_filename, output_filename) :
	with open(input_filename) as file :
		contents = file.read()
		word_set = set(contents.split())
	with open(output_filename, "w+") as output_file :
		for word in word_set :
			output_file.write(word + '\n')
	print ("Done")


def unique_file(input_filename, output_filename):
    df = pd.read_csv(input_filename, sep=" ", header=None)
    df = df[0].drop_duplicates()
    df.to_csv(output_filename, index=False)
    print("Done")

#6


