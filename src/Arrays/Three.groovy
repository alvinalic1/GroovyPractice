package Arrays

//Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space
//at the end of the array to hold the additional characters

String replaceURL(String input)
{
    return input.trim().replaceAll(" ", "%20")
}

assert replaceURL("Mr John Smith      ") == "Mr%20John%20Smith"
