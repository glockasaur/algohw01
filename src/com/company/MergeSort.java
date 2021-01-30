package com.company;

import java.io.PrintWriter;

public class MergeSort {
        // Merges two subarrays of array[].
        // First subarray is array[l..m]
        // Second subarray is array[m+1..r]

        void merge(int array[], int left, int middle, int right)
        {
            // Find sizes of the 2 sub arrays
            int n1 = middle - left + 1;
            int n2 = right - middle;

            // Create temporary arrays
            int Lefty[] = new int[n1];
            int Righty[] = new int[n2];

            //Copy integers to temp arrays using for loops
            for (int i = 0; i < n1; ++i)
                Lefty[i] = array[left + i];
            for (int j = 0; j < n2; ++j)
                Righty[j] = array[middle + 1 + j];

            /* Merge the temp arrays */

            // Initial indexes of first and second sub-arrays
            int i = 0;
            int j = 0;

            // Initial index of merged sub-array array
            int k = left;
            while (i < n1 && j < n2) {
                if (Lefty[i] <= Righty[j]) {
                    array[k] = Lefty[i];
                    i++;
                }
                else {
                    array[k] = Righty[j];
                    j++;
                }
                k++;
            }

            /* Copy remaining elements of Lefty[] if any */
            while (i < n1) {
                array[k] = Lefty[i];
                i++;
                k++;
            }

            /* Copy remaining elements of Righty[] if any */
            while (j < n2) {
                array[k] = Righty[j];
                j++;
                k++;
            }
        }

        // Main method that sorts array[l..r] using merge()
        void sort(int arr[], int l, int r)
        {
            if (l < r) {
                // Find the middle point
                int m = (l + r) / 2;

                // Sort first and second halves
                sort(arr, l, m);
                sort(arr, m + 1, r);

                // Merge the sorted halves
                merge(arr, l, m, r);
            }
        }

  /**
   * Method that prints out the sorted array using Merge Sort algo
   *
   * @param sortedArray - array that is sorted
   */
  static void printMerge(int sortedArray[]) {
    if (sortedArray.length == 10) {
      try {
        PrintWriter pr = new PrintWriter("10randomMS.txt");
        int n = sortedArray.length;

        for (int i = 0; i < n; i++) {
          pr.println(sortedArray[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }
      if (sortedArray.length == 100) {
          try {
              PrintWriter pr = new PrintWriter("100randomMS.txt");
              int n = sortedArray.length;

              for (int i = 0; i < n; i++) {
                  pr.println(sortedArray[i]);
              }
              pr.close();
          } catch (Exception e) {
              e.printStackTrace();
              System.out.println("No such file exists.");
          }
      }
      if (sortedArray.length == 1000) {
          try {
              PrintWriter pr = new PrintWriter("1000randomMS.txt");
              int n = sortedArray.length;

              for (int i = 0; i < n; i++) {
                  pr.println(sortedArray[i]);
              }
              pr.close();
          } catch (Exception e) {
              e.printStackTrace();
              System.out.println("No such file exists.");
          }
      }
      if (sortedArray.length == 10000) {
          try {
              PrintWriter pr = new PrintWriter("10000randomMS.txt");
              int n = sortedArray.length;

              for (int i = 0; i < n; i++) {
                  pr.println(sortedArray[i]);
              }
              pr.close();
          } catch (Exception e) {
              e.printStackTrace();
              System.out.println("No such file exists.");
          }
      }
      if (sortedArray.length == 100000) {
          try {
              PrintWriter pr = new PrintWriter("100000randomMS.txt");
              int n = sortedArray.length;

              for (int i = 0; i < n; i++) {
                  pr.println(sortedArray[i]);
              }
              pr.close();
          } catch (Exception e) {
              e.printStackTrace();
              System.out.println("No such file exists.");
          }
      }
      if (sortedArray.length == 1000000) {
          try {
              PrintWriter pr = new PrintWriter("1000000randomMS.txt");
              int n = sortedArray.length;

              for (int i = 0; i < n; i++) {
                  pr.println(sortedArray[i]);
              }
              pr.close();
          } catch (Exception e) {
              e.printStackTrace();
              System.out.println("No such file exists.");
          }
      }
}

    /**
     * Method that prints out the accending sorted array using Merge Sort algo
     *
     * @param sortedArray - array that is sorted
     */
    static void printMergeAcc(int sortedArray[]) {
        if (sortedArray.length == 10) {
            try {
                PrintWriter pr = new PrintWriter("10accMS.txt");
                int n = sortedArray.length;

                for (int i = 0; i < n; i++) {
                    pr.println(sortedArray[i]);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        if (sortedArray.length == 100) {
            try {
                PrintWriter pr = new PrintWriter("100accMS.txt");
                int n = sortedArray.length;

                for (int i = 0; i < n; i++) {
                    pr.println(sortedArray[i]);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        if (sortedArray.length == 1000) {
            try {
                PrintWriter pr = new PrintWriter("1000accMS.txt");
                int n = sortedArray.length;

                for (int i = 0; i < n; i++) {
                    pr.println(sortedArray[i]);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        if (sortedArray.length == 10000) {
            try {
                PrintWriter pr = new PrintWriter("10000accMS.txt");
                int n = sortedArray.length;

                for (int i = 0; i < n; i++) {
                    pr.println(sortedArray[i]);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        if (sortedArray.length == 100000) {
            try {
                PrintWriter pr = new PrintWriter("100000accMS.txt");
                int n = sortedArray.length;

                for (int i = 0; i < n; i++) {
                    pr.println(sortedArray[i]);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        if (sortedArray.length == 1000000) {
            try {
                PrintWriter pr = new PrintWriter("1000000accMS.txt");
                int n = sortedArray.length;

                for (int i = 0; i < n; i++) {
                    pr.println(sortedArray[i]);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
    }


    /**
     * Method that prints out the descending sorted array using Merge Sort algo
     *
     * @param sortedArray - array that is sorted
     */
    static void printMergeDes(int sortedArray[]) {
        if (sortedArray.length == 10) {
            try {
                PrintWriter pr = new PrintWriter("10desMS.txt");
                int n = sortedArray.length;

                for (int i = 0; i < n; i++) {
                    pr.println(sortedArray[i]);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        if (sortedArray.length == 100) {
            try {
                PrintWriter pr = new PrintWriter("100desMS.txt");
                int n = sortedArray.length;

                for (int i = 0; i < n; i++) {
                    pr.println(sortedArray[i]);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        if (sortedArray.length == 1000) {
            try {
                PrintWriter pr = new PrintWriter("1000desMS.txt");
                int n = sortedArray.length;

                for (int i = 0; i < n; i++) {
                    pr.println(sortedArray[i]);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        if (sortedArray.length == 10000) {
            try {
                PrintWriter pr = new PrintWriter("10000desMS.txt");
                int n = sortedArray.length;

                for (int i = 0; i < n; i++) {
                    pr.println(sortedArray[i]);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        if (sortedArray.length == 100000) {
            try {
                PrintWriter pr = new PrintWriter("100000desMS.txt");
                int n = sortedArray.length;

                for (int i = 0; i < n; i++) {
                    pr.println(sortedArray[i]);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
        if (sortedArray.length == 1000000) {
            try {
                PrintWriter pr = new PrintWriter("1000000desMS.txt");
                int n = sortedArray.length;

                for (int i = 0; i < n; i++) {
                    pr.println(sortedArray[i]);
                }
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No such file exists.");
            }
        }
    }
    }
