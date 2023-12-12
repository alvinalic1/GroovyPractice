package Arrays

//Question 1.2
//Given two strings, write a method to decide if one is a permutation of the other (assuming it isn't case sensitive)

boolean checkPermutation(String first, String second)
{
    char[] word1 = first.collect {it as char}

    char[] word2 = second.collect{it as char}

    Arrays.sort(word1)
    Arrays.sort(word2)

    return Arrays.equals(word1, word2)
}


assert checkPermutation("top", "pot") == true
assert checkPermutation("alvin", "vilan") == true
assert checkPermutation("samed", "dames") == true
assert checkPermutation("alvin", "ajla") == false

println "Tests Passes"
