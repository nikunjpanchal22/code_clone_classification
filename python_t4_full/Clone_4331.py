def query_yes_no(question, default = True) :
	yes_list = ["yes", "y"]
	no_list = ["no", "n"]



def query_yes_no(question, default=True):
    while True:
        response = input(question).lower()
        if response in yes_list:
            return True
        elif response in no_list:
            return False
        elif default is True:
            return True
        elif default is False:
            return False



