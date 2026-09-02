def analyze_usage(usage):
    total = sum(usage)
    average = total / len(usage)

    print("Water Usage Analysis")
    print("Total Usage:", total, "liters")
    print("Average Usage:", average, "liters")


daily_usage = [120, 150, 130, 160, 140]

analyze_usage(daily_usage)