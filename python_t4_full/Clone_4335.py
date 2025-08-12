def query_yes_no(question, default = True) :
	yes_list = ["yes", "y"]
	no_list = ["no", "n"]



def query_yes_no(question, default=True):
    while True:
        reply = input(question).strip().lower()
        if reply in yes_list:
            return True
        if reply in no_list:
            return False



