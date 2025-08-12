def salary_sort(thing) :
    salaries = []
    for employee in thing:
        salaries.append(employee.salary) 
    return sorted(salaries)


 def salary_sort(thing):
    result = [emp for emp in thing]
    result.sort(key=lambda x: x.salary)
    return result


