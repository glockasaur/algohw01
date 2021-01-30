package com.company;

// Java program for implementation of Insertion Sort

import java.io.PrintWriter;

/** Insertion Sort Class This is the Insertion Sort Algorithm */
class InsertionSort {

  /*Function to sort array using insertion sort*/
  void sort(int array[]) {
    int n = array.length; // length of array
    // for loop to traverse thru array
    for (int i = 1; i < n; ++i) {
      int key = array[i];
      int j = i - 1;

      /* Move elements of array[0..i-1], that are
      greater than key, to one position ahead
      of their current position */
      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[j + 1] = key;
    }
  }

  /**
   * Method to print the sorted array
   *
   * @param arraySorted - integer array
   */
  static void printInsert(int arraySorted[]) {
    if (arraySorted.length == 10) {
      try {
        PrintWriter pr = new PrintWriter("10randomIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }

    if (arraySorted.length == 100) {
      try {
        PrintWriter pr = new PrintWriter("100randomIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }
    if (arraySorted.length == 1000) {
      try {
        PrintWriter pr = new PrintWriter("1000randomIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }

    if (arraySorted.length == 10000) {
      try {
        PrintWriter pr = new PrintWriter("10000randomIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }

    if (arraySorted.length == 100000) {
      try {
        PrintWriter pr = new PrintWriter("100000randomIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }

    if (arraySorted.length == 1000000) {
      try {
        PrintWriter pr = new PrintWriter("1000000randomIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }
  }


  /**
   * Method to print the sorted array when already ascending order
   *
   * @param arraySorted - integer array
   */
  static void printInsertAcc(int arraySorted[]) {
    if (arraySorted.length == 10) {
      try {
        PrintWriter pr = new PrintWriter("10accIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }

    if (arraySorted.length == 100) {
      try {
        PrintWriter pr = new PrintWriter("100accIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }
    if (arraySorted.length == 1000) {
      try {
        PrintWriter pr = new PrintWriter("1000accIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }

    if (arraySorted.length == 10000) {
      try {
        PrintWriter pr = new PrintWriter("10000accIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }

    if (arraySorted.length == 100000) {
      try {
        PrintWriter pr = new PrintWriter("100000accIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }

    if (arraySorted.length == 1000000) {
      try {
        PrintWriter pr = new PrintWriter("1000000accIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }
  }


  /**
   * Method to print the sorted array when already ascending order
   *
   * @param arraySorted - integer array
   */
  static void printInsertDes(int arraySorted[]) {
    if (arraySorted.length == 10) {
      try {
        PrintWriter pr = new PrintWriter("10desIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }

    if (arraySorted.length == 100) {
      try {
        PrintWriter pr = new PrintWriter("100desIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }
    if (arraySorted.length == 1000) {
      try {
        PrintWriter pr = new PrintWriter("1000desIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }

    if (arraySorted.length == 10000) {
      try {
        PrintWriter pr = new PrintWriter("10000desIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }

    if (arraySorted.length == 100000) {
      try {
        PrintWriter pr = new PrintWriter("100000desIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }

    if (arraySorted.length == 1000000) {
      try {
        PrintWriter pr = new PrintWriter("1000000desIS.txt");
        int n = arraySorted.length;

        for (int i = 0; i < n; i++) {
          pr.println(arraySorted[i]);
        }
        pr.close();
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("No such file exists.");
      }
    }
  }
}
