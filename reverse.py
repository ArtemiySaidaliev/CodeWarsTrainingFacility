def spin_words(sentence):
    sentence = sentence.split(" ")
    i = 0
    while i < len(sentence):
        if len(sentence[i]) >= 5:
            sentence[i] = sentence[i][::-1]
        i+=1
    sentence = " ".join(sentence)
    return sentence

print(spin_words("hello my friend pedro"))