def solution(number):
    i = 0
    sum = 0
    while i < number:
        sum+=i
        i+=5
    i = 0
    while i < number:
        if i % 5 != 0:
            sum+=i
        i+=3
    return sum
    pass


print(solution(5))
