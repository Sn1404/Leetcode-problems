void reverseHelper(char* s, int left, int right)
{
    if (left >= right)
        return;

    char temp = s[left];
    s[left] = s[right];
    s[right] = temp;

    reverseHelper(s, left + 1, right - 1);
}

void reverseString(char* s, int sSize)
{
    reverseHelper(s, 0, sSize - 1);
}