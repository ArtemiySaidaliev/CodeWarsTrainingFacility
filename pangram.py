"""
So my idea of solution was to make every character to lower case then delete every digit, spaces and repeats.
After that I sum every ascii code and if this sum equals to 2847 than it's pangram

if we sum numbers from 97 which is a in ASCII to 122 which is z we get 2847
"""
def is_pangram(s):
    s = s.lower()
    i = 0
    sum = 0

    s = "".join(set(s))
    while i < len(s):
        if s[i].isalpha():
            sum+=ord(s[i])
        i+=1
    if sum == 2847:
        return True
    else:
        return False

print(is_pangram("The quick, brown fox jump12s over t23he lazy dog!"))