package Arrays

//Question 1.1 From Cracking the Coding Interview
//Implement an algorithm to determine if a string has all unique characters

boolean hasUniqueCharacters(String word)
{
    Set<Character> letters = new HashSet<>()
    boolean unique = true

    word.each { current ->
        char currentCharacter = current
        if(letters.contains(currentCharacter))
        {
            unique = false
            return
        }
        letters.add(currentCharacter)
    }

    return unique;
}

assert hasUniqueCharacters("Hello") == false
assert hasUniqueCharacters("World") == true
assert hasUniqueCharacters("abcdefghijklmnopqrstuvwxyz") == true
assert hasUniqueCharacters("abcdefghijklmmnopqrstuvwxyz") == false
assert hasUniqueCharacters("") == true

println "All tests passed"