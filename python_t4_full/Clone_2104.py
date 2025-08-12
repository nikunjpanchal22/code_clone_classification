def test2():
    import json
    import time


def test2():
    import json
    import time

    time_start = time.time()
    data = []
    with open("data.csv", "r") as f:
        reader = csv.reader(f, delimiter="\t")
        for row in reader:
            data.append(row)
    all_point_sets = [Point(*xy) for row in data for xy in zip(*row)]
    time_end = time.time()


