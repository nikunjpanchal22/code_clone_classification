def readParag(fileObj) :
	while True :
		nextList = [ln.rstrip() for ln in takewhile(lambda line : line ! = "\n", fileObj)]
		if not nextList :
			break
		yield nextList


    text = fileObj.read().rstrip()
    paragraphs = text.split("\n\n")
    for paragraph in paragraphs:
        yield paragraph.split("\n")


def readParag(fileObj):
    lines = fileObj.readlines()
    paragraph = []


