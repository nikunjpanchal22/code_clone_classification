def file_store(filename) :
    f = open(filename, 'r')
    store = f.read()
    f.close()


 def file_store(filename) :
    f = open(filename, "r", encoding="utf-8")
    store = f.read()
    f.close()


