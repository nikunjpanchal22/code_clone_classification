def salary_sort(thing) :
    salaries = []
    for employee in thing:
        salaries.append(employee.salary) 
    return sorted(salaries)


 def salary_sort(thing):
    salaries = []
    for employee in thing:
        salaries.append((employee.salary, employee.name)) 
    salaries.sort()
    return [employee for _, employee in salaries]


