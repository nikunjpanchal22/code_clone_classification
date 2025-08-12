def query_yes_no(question, default = True) :
	yes_list = ["yes", "y"]
	no_list = ["no", "n"]



def query_yes_no(question, default=True):
    if input(question).lower() in yes_list:
        return True
    elif input(question).lower() in no_list:
        return False
    else:
        return default



