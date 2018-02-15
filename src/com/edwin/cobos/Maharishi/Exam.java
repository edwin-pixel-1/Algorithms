package com.edwin.cobos.Maharishi;

public class Exam {

    public Exam() {
        //Test 1
        //int rr = hasSingleMaximum(new int[]{-6, -6, -6, -6, -6, -6, -6});
        //System.out.println(rr);

        //Test 2
        //int rr = isPairedN(new int[]{}, 0);
        //System.out.println(rr);

        //Test 3
//        int rr = isSelfReferential(new int[]{1, 2, 1, 0});
//        System.out.println(rr);
//        rr = isSelfReferential(new int[]{2, 0, 2, 0});
//        System.out.println("{2, 0, 2, 0} = " + rr);
//        rr = isSelfReferential(new int[]{2, 1, 2, 0, 0});
//        System.out.println("{2, 1, 2, 0, 0} = " + rr);
//        rr = isSelfReferential(new int[]{3, 2, 1, 1, 0, 0, 0});
//        System.out.println("{3, 2, 1, 1, 0, 0, 0} = " + rr);
//        rr = isSelfReferential(new int[]{4, 2, 1, 0, 1, 0, 0, 0});
//        System.out.println("{4, 2, 1, 0, 1, 0, 0, 0} = " + rr);
//        rr = isSelfReferential(new int[]{5, 2, 1, 0, 0, 1, 0, 0, 0});
//        System.out.println("{5, 2, 1, 0, 0, 1, 0, 0, 0} = " + rr);
//        rr = isSelfReferential(new int[]{6, 2, 1, 0, 0, 0, 1, 0, 0, 0});
//        System.out.println("{6, 2, 1, 0, 0, 0, 1, 0, 0, 0} = " + rr);
//        rr = isSelfReferential(new int[]{2, 0, 0});
//        System.out.println("{2, 0, 0} = " + rr);
//        rr = isSelfReferential(new int[]{2});
//        System.out.println("{2} = " + rr);
//        rr = isSelfReferential(new int[]{2, 0, 3, 1});
//        System.out.println("{2, 0, 3, 0} = " + rr);

    }

    /*
    3. An array a is defined to be self-referential if for i=0 to a.length-1,
    a[i] is the count of the number of times that the value i appears in the array.
    As the following table indicates, {1, 2, 1, 0} is a self-referential array.

    i      a[i]     comment
    0		1		There is one 0 in the array. (a[0] = 1)
    1		2		There are two 1s in the array (a[1] = 2)
    2		1		There is one 2 in the array (a[2] = 1)
    3		0		There are no 3s in the array (a[3] = 0)
    Here are some examples of arrays that are not self-referential:

    {2, 0, 0} is not a self-referential array. There are two 0s and no 1s. But unfortunately there is a 2 which contradicts a[2] = 0.

    {0} is not a self-referential array because there is one 0, but since a[0] = 0, there has to be no 0s.

    {1} is not a self-referential array because there is not a 0 in the array as required by a[0] = 1.

    Self-referential arrays are rare. Here are the self-referential arrays for arrays of lengths up to 10 elements:

    {1, 2, 1, 0} (see above)
    {2, 0, 2, 0} (there are two 0s, no 1s, two 2s and no 3s
    {2, 1, 2, 0, 0}  (there are two 0s, one 1, two 2s, no 3s and no 4s)
    {3, 2, 1, 1, 0, 0, 0} (there are three 0s, two 1s, one 2, one 3, no 4s, 5s or 6s)
    {4, 2, 1, 0, 1, 0, 0, 0} (there are four 0s, two 1s, one 2, no 3s, one 4, and no 5s, 6s, or 7s)
    {5, 2, 1, 0, 0, 1, 0, 0, 0} (there are five 0s, two 1s, one 2, no 3s or 4s, one 5, and no 6s, 7s, or 8s)
    {6, 2, 1, 0, 0, 0, 1, 0, 0, 0} (there are six 0s, two 1s, one 2, no 3s, 4s, or 5s, one 6, and no 7s, 8s, or 9s)
    Write a function named isSelfReferential that returns 1 if its array argument is self-referential, otherwise it returns 0.

    If you are programming in Java or C#, the function signature is
       int isSelfReferential(int[ ] a)

    If you are programming in C or C++, the function signature is
       int isSelfReferential(int a[ ], int len) where len is the number of elements in the array
     */
    public int isSelfReferential(int[] a) {
        boolean isSelfReferential = false;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int value : a) {
                if (value == i)
                    count++;
            }
            if(count != a[i])
                return 0;
        }

        return 1;
    }


    /*
    2. An array is defined to be paired-N if it contains two distinct elements that sum to N
    for some specified value of N and the indexes of those elements also sum to N.
    Write a function named isPairedN that returns 1 if its array parameter is a paired-N array.
    The value of N is passed as the second parameter.

    If you are writing in Java or C#, the function signature is
    int isPairedN(int[ ] a, int n)

    If you are writing in C or C++, the function signature is
    int isPairedN(int a[ ], int n, int len) where len is the length of a

    There are two additional requirements.

    - Once you know the array is paired-N, you should return 1. No wasted loop iterations please.

    - Do not enter the loop unless you have to.
    You should test the length of the array and the value of n to determine whether the array could possibly be a paired-N array.
    If the tests indicate no, return 0 before entering the loop.

    Examples
	----------------------------------------------------------------------------------------------------------------
    if a is---------------------and n is-----return-----reason
    ----------------------------------------------------------------------------------------------------------------
    {1, 4, 1, 4, 5, 6}..............5...........1.......because a[2] + a[3] == 5 and 2+3==5. In other words, the sum of the values is equal to the sum of the corresponding indexes and both are equal to n (5 in this case).
    {1, 4, 1, 4, 5, 6}..............6...........1.......because a[2] + a[4] == 6 and 2+4==6
    {0, 1, 2, 3, 4, 5, 6, 7, 8}.....6...........1.......because a[1]+a[5]==6 and 1+5==6
    {1, 4, 1}.......................5...........0.......because although a[0] + a[1] == 5, 0+1 != 5; and although a[1]+a[2]==5, 1+2 != 5
    {8, 8, 8, 8, 7, 7, 7}...........15..........0.......because there are several ways to get the values to sum to 15 but there is no way to get the corresponding indexes to sum to 15.
    {8, -8, 8, 8, 7, 7, -7}........-15..........0.......because although a[1]+a[6]==-15, 1+6!=-15
    {3}.............................3...........0.......because the array has only one element
    {}..............................0...........0.......because the array has no elements
    ----------------------------------------------------------------------------------------------------------------
     */
    public int isPairedN(int[] a, int n) {
        if (a == null || a.length < 2 || n < 1 || n > a.length)
            return 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sumValues = a[i] + a[j];
                int sumIndex = i + j;
                if (sumValues == n && sumIndex == n) {
                    return 1;
                }
            }
        }

        return 0;
    }

    /*
    1. Write a function named hasSingleMaximum that takes an array argument and returns 1
    if the maximum value in its array argument occurs exactly once in the array, otherwise it returns 0.

    If you are writing in Java or C#, the function signature is
    int hasSingleMaximum(int[ ] a)

    If you are writing in C or C++, the function signature is
    int hasSingleMaximum(int a[ ], int len) where len is the length of a

    Examples
	----------------------------------------------------------------------------------------------------------------
    if a is---------------------------return----reason
    ----------------------------------------------------------------------------------------------------------------
    {1, 2, 3, 1, 0}---------------------1-------because the maximum value 3 occurs only once in the array
    {18}--------------------------------1-------because the maximum value 18 occurs exactly once in the array
    {1, 2, 3, 0, 1, 3}------------------0-------because the maximum value 3 occurs twice in the array
    {13, 1, 13, 2, 13, 0, 13, 1, 13}----0-------because the maximum value 13 occurs more than once in the array
    {}----------------------------------0-------because there is no maximum value
    {-6, -6, -6, -6, -6, -6, -6}--------0-------because the maximum value -6 occurs more than once in the array
    ----------------------------------------------------------------------------------------------------------------
     */
    public int hasSingleMaximum(int[] a) {
        if (a == null || a.length == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        boolean isSingleMax = true;
        for (int value : a) {
            if (value == max) {
                isSingleMax = false;
            } else if (value > max) {
                max = value;
                isSingleMax = true;
            }
        }

        return isSingleMax ? 1 : 0;
    }
}
