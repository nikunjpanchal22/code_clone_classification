def test2():
    import json
    import time


def test2():
    import json
    import time

    time_start = time.time()
    data = []
    with open("data.csv", "rb") as f:
        reader = csv.reader(f)
        for row in reader:
            data.append(row)
    all_point_sets = [Point(*xy) for row in data for xy, value in zip(*row)]
    time_end = time.time()
    print("total time: ", (time_end - time_start))




