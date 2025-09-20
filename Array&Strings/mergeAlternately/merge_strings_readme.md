# Merge Strings Alternately

## What I Need to Do
Take two words and mix them letter by letter.

## Example
- word1 = "abc"  
- word2 = "pqr"  
- Result = "a" + "p" + "b" + "q" + "c" + "r" = "apbqcr"

## My Steps
1. Take first letter from word1, then first letter from word2
2. Take second letter from word1, then second letter from word2  
3. Keep going until one word ends
4. Add the leftover letters from the longer word

## My Code
```java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        // Mix letters one by one
        while (i < word1.length() && i < word2.length()) {
            result.append(word1.charAt(i));  // Add from word1
            result.append(word2.charAt(i));  // Add from word2
            i++;
        }
        
        // Add leftover from word1
        while (i < word1.length()) {
            result.append(word1.charAt(i));
            i++;
        }
        
        // Add leftover from word2
        while (i < word2.length()) {
            result.append(word2.charAt(i));
            i++;
        }
        
        return result.toString();
    }
}
```

## What I Learned
- Use `charAt(i)` to get one letter at a time
- Use `StringBuilder` to build the answer
- Check both strings have letters before mixing
- Don't forget the leftover letters!

## Time Taken
30 minutes (first try - normal for beginners!)