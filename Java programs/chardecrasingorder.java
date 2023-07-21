#include <stdio.h>
#include <stdlib.h>

struct CharFrequency {
    char character;
    int frequency;
};


void printCharactersByFrequency(char* text) {
    struct CharFrequency frequencyPairs[256] = {0};  // Assuming ASCII characters
    int i;

    // Count the frequency of each character
    for (i = 0; text[i] != '\0'; i++) {
        frequencyPairs[(int)text[i]].character = text[i];
        frequencyPairs[(int)text[i]].frequency++;
    }

    // Sort the character-frequency pairs
    sortFrequencyPairs(frequencyPairs, 256);

    // Print the characters in decreasing order of frequency
    for (i = 0; i < 256; i++) {
        if (frequencyPairs[i].frequency > 0) {
            printf("%c: %d\n", frequencyPairs[i].character,

frequencyPairs[i].frequency);
        }
    }
}




void sortFrequencyPairs(struct CharFrequency pairs[], int n) {
    // Bubble sort implementation
    int i, j;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - 1-i; j++) {
            if (pairs[j].frequency < pairs[j + 1].frequency) {
                // Swap pairs[j] and pairs[j +1]
                struct CharFrequency temp = pairs[j];
                pairs[j] = pairs[j + 1];
                pairs[j + 1] = temp; 
            }
        }
    }
}



int main() {
    char text[] = "Helllhop";
    printCharactersByFrequency(text);
    return 0;
}