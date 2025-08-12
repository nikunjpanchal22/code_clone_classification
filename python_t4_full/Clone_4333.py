def query_yes_no(question, default = True) :
	yes_list = ["yes", "y"]
	no_list = ["no", "n"]



def query_yes_no(question, default=True):
    option = input(question)
    if option.lower() in yes_list:
        return True
    elif option.lower() in no_list:
        return False
    else:
        return default



