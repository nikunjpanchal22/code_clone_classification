def fileCount(path, extension) :
	count = 0
	for root, dirs, files in os.walk(path) :
		count += sum(f.endswith(extension) for f in files)
	return count


 def countSubstring(string, sub_string) :
    filesInDir = [f for f in os.listdir(path) if f.endswith(extension)]
    count = len([f for f in filesInDir if f[-len(sub_string):] == sub_string])
    return count


