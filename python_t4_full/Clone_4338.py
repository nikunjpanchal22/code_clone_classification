def query_yes_no(question, default = True) :
	yes_list = ["yes", "y"]
	no_list = ["no", "n"]



def query_yes_no(question, default=True):
    selection = input(question).lower()
    return True if selection in yes_list else False if selection in no_list else None



