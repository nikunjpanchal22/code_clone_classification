def file_store(filename) :
    f = open(filename, 'r')
    store = f.read()
    f.close()


 def file_store(filename) :
    with open(filename, 'r') as f:
        store = f.read().strip("\n")


