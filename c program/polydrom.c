#include <stdio.h>
#include <string.h>

int isPalindrome(const char *input) {
    int start = 0;
    int end = strlen(input) - 1;

    while (start < end) {
        if (input[start] != input[end]) {
            return 1; // Not a palindrome
        }
        start++;
        end--;
    }
    return 0; // Palindrome
}

int main() {
    const char *input1 = "somsomxyzzyxpropro";
    const char *input2 = "sommos";

    int result1 = isPalindrome(input1);
    int result2 = isPalindrome(input2);

    printf("INPUT: %s OUTPUT: %d\n", input1, result1);
    printf("INPUT: %s OUTPUT: %d\n", input2, result2);

    return 0;
}

