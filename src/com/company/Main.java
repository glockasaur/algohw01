package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

import static com.company.ReadFile.readFile;

public class Main {

  public static void main(String[] args) throws IOException {

    // Code to generate the text files that will be inputted into the sorting algorithms

    long start;
    long finish;
    long timeElapsed;

    int tenKeys = 10;
    int hundredKeys = 100;
    int thousandKeys = 1000;
    int tenThousandKeys = 10000;
    int hundredThousandKeys = 100000;
    int millionKeys = 1000000;

    numberGenerator ten = new numberGenerator();
    ten.generateRandom(tenKeys);

    numberGenerator hundred = new numberGenerator();
    hundred.generateRandom(hundredKeys);

    numberGenerator thousand = new numberGenerator();
    thousand.generateRandom(thousandKeys);

    numberGenerator tenthousand = new numberGenerator();
    tenthousand.generateRandom(tenThousandKeys);

    numberGenerator hundredthousand = new numberGenerator();
    hundredthousand.generateRandom(hundredThousandKeys);

    numberGenerator million = new numberGenerator();
    million.generateRandom(millionKeys);

    /** RANDOM TEN INTEGERS */
    ReadFile tenFile = new ReadFile();
    readFile(new File("10keys.txt"));
    int arrayten[] = tenFile.getFile();

    // code to sort the array using Insertion Sort Algorithm
    start = System.currentTimeMillis();
    InsertionSort tenIO = new InsertionSort();
    tenIO.sort(arrayten);
    tenIO.printInsert(arrayten);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Random 10 Insertion Sort took " + timeElapsed + " milliseconds.");

    // code to sort the array using Merge Sort algorithm
    start = System.currentTimeMillis();
    MergeSort tenMS = new MergeSort();
    tenMS.sort(arrayten, 0, arrayten.length - 1);
    tenMS.printMerge(arrayten);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Random 10 Merge Sort took " + timeElapsed + " milliseconds.");


    /** RANDOM HUNDRED INTEGERS */
    ReadFile hundredFile = new ReadFile();
    readFile(new File("100keys.txt"));
    int arrayhundred[] = hundredFile.getFile();

    start = System.currentTimeMillis();
    InsertionSort hundredIO = new InsertionSort();
    hundredIO.sort(arrayhundred);
    hundredIO.printInsert(arrayhundred);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Random 100 Insertion Sort took " + timeElapsed + " milliseconds.");

    start = System.currentTimeMillis();
    MergeSort hundredMS = new MergeSort();
    hundredMS.sort(arrayhundred, 0, arrayhundred.length - 1);
    hundredMS.printMerge(arrayhundred);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Random 100 Merge Sort took " + timeElapsed + " milliseconds.");


    /** RANDOM THOUSAND INTEGERS */
    ReadFile thousandFile = new ReadFile();
    readFile(new File("1000keys.txt"));
    int arraythousand[] = thousandFile.getFile();

    start = System.currentTimeMillis();
    InsertionSort thousandIO = new InsertionSort();
    thousandIO.sort(arraythousand);
    thousandIO.printInsert(arraythousand);
    finish = System.currentTimeMillis();
    timeElapsed= finish - start;
    System.out.println("Random 1000 Insertion Sort took " + timeElapsed + " milliseconds.");

    start = System.currentTimeMillis();
    MergeSort thousandMS = new MergeSort();
    thousandMS.sort(arraythousand, 0, arraythousand.length - 1);
    thousandMS.printMerge(arraythousand);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Random 1000 Merge Sort took " + timeElapsed + " milliseconds.");


    /** RANDOM TEN THOUSAND INTEGERS */
    ReadFile tenthousandFile = new ReadFile();
    readFile(new File("10000keys.txt"));
    int arraytenthousand[] = tenthousandFile.getFile();

    start = System.currentTimeMillis();
    InsertionSort tenthousandIO = new InsertionSort();
    tenthousandIO.sort(arraytenthousand);
    tenthousandIO.printInsert(arraytenthousand);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Random 10000 Insertion Sort took " + timeElapsed + " milliseconds.");

    start = System.currentTimeMillis();
    MergeSort tenthousandMS = new MergeSort();
    tenthousandMS.sort(arraytenthousand, 0, arraytenthousand.length - 1);
    tenthousandMS.printMerge(arraytenthousand);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Random 10000 Merge Sort took " + timeElapsed + " milliseconds.");

    /** RANDOM HUNDRED THOUSAND INTEGERS */
    ReadFile hundredthousandFile = new ReadFile();
    readFile(new File("100000keys.txt"));
    int arrayhundredthousand[] = hundredthousandFile.getFile();

    start = System.currentTimeMillis();
    InsertionSort hundredthousandIO = new InsertionSort();
    hundredthousandIO.sort(arrayhundredthousand);
    hundredthousandIO.printInsert(arrayhundredthousand);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Random 100000 Insertion Sort took " + timeElapsed + " milliseconds.");

    start = System.currentTimeMillis();
    MergeSort hundredthousandMS = new MergeSort();
    hundredthousandMS.sort(arrayhundredthousand, 0, arrayhundredthousand.length - 1);
    hundredthousandMS.printMerge(arrayhundredthousand);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Random 100000 Merge Sort took " + timeElapsed + " milliseconds.");


    /** RANDOM MILLION INTEGERS */
    ReadFile millionFile = new ReadFile();
    millionFile.readFile(new File("1000000keys.txt"));
    int arraymillion[] = millionFile.getFile();

    start = System.currentTimeMillis();
    InsertionSort millionIO = new InsertionSort();
    millionIO.sort(arraymillion);
    millionIO.printInsert(arraymillion);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Random 1000000 Insertion Sort took " + timeElapsed + " milliseconds.");

    start = System.currentTimeMillis();
    MergeSort millionMS = new MergeSort();
    millionMS.sort(arraymillion, 0, arraymillion.length - 1);
    millionMS.printMerge(arraymillion);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Random 1000000 Merge Sort took " + timeElapsed + " milliseconds.");


    /** ACCENDING TEN INTEGERS */
    ReadFile tenaccFile = new ReadFile();
    readFile(new File("10keysaccending.txt"));
    int arraytenacc[] = tenaccFile.getFile();

    // code to sort the array using Insertion Sort Algorithm
    start = System.currentTimeMillis();
    InsertionSort tenaccIO = new InsertionSort();
    tenaccIO.sort(arraytenacc);
    tenaccIO.printInsertAcc(arraytenacc);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Accending 10 Insertion Sort took " + timeElapsed + " milliseconds.");


    // code to sort the array using Merge Sort algorithm
    start = System.currentTimeMillis();
    MergeSort tenaccMS = new MergeSort();
    tenaccMS.sort(arraytenacc, 0, arraytenacc.length - 1);
    tenaccMS.printMergeAcc(arraytenacc);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Accending 10 Merge Sort took " + timeElapsed + " milliseconds.");

    /** ACCENDING ONE HUNDRED INTEGERS */
    ReadFile hundredaccFile = new ReadFile();
    readFile(new File("100keysaccending.txt"));
    int arrayhundredacc[] = hundredaccFile.getFile();

    // code to sort the array using Insertion Sort Algorithm
    start = System.currentTimeMillis();
    InsertionSort hundredaccIO = new InsertionSort();
    hundredaccIO.sort(arrayhundredacc);
    hundredaccIO.printInsertAcc(arrayhundredacc);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Accending 100 Insertion Sort took " + timeElapsed + " milliseconds.");

    // code to sort the array using Merge Sort algorithm
    start = System.currentTimeMillis();
    MergeSort hundredaccMS = new MergeSort();
    hundredaccMS.sort(arrayhundredacc, 0, arrayhundredacc.length - 1);
    hundredaccMS.printMergeAcc(arrayhundredacc);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Accending 100 Merge Sort took " + timeElapsed + " milliseconds.");



    /** ACCENDING THOUSAND INTEGERS */
    ReadFile thousandaccFile = new ReadFile();
    readFile(new File("1000keysaccending.txt"));
    int arraythousandacc[] = thousandaccFile.getFile();

    // code to sort the array using Insertion Sort Algorithm
    start = System.currentTimeMillis();
    InsertionSort thousandaccIO = new InsertionSort();
    thousandaccIO.sort(arraythousandacc);
    thousandaccIO.printInsertAcc(arraythousandacc);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Accending 1000 Insertion Sort took " + timeElapsed + " milliseconds.");

    // code to sort the array using Merge Sort algorithm
    start = System.currentTimeMillis();
    MergeSort thousandaccMS = new MergeSort();
    thousandaccMS.sort(arraythousandacc, 0, arraythousandacc.length - 1);
    thousandaccMS.printMergeAcc(arraythousandacc);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Accending 1000 Merge Sort took " + timeElapsed + " milliseconds.");


    /** ACCENDING TEN THOUSAND INTEGERS */
    ReadFile tenthousandaccFile = new ReadFile();
    readFile(new File("10000keysaccending.txt"));
    int arraytenthousandacc[] = tenthousandaccFile.getFile();

    // code to sort the array using Insertion Sort Algorithm
    start = System.currentTimeMillis();
    InsertionSort tenthousandaccIO = new InsertionSort();
    tenthousandaccIO.sort(arraytenthousandacc);
    tenthousandaccIO.printInsertAcc(arraytenthousandacc);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Accending 10000 Insertion Sort took " + timeElapsed + " milliseconds.");

    // code to sort the array using Merge Sort algorithm
    start = System.currentTimeMillis();
    MergeSort tenthousandaccMS = new MergeSort();
    tenthousandaccMS.sort(arraytenthousandacc, 0, arraytenthousandacc.length - 1);
    tenthousandaccMS.printMergeAcc(arraytenthousandacc);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Accending 10000 Merge Sort took " + timeElapsed + " milliseconds.");


    /** ACCENDING HUNDRED THOUSAND INTEGERS */
    ReadFile hundredthousandaccFile = new ReadFile();
    readFile(new File("100000keysaccending.txt"));
    int arrayhundredthousandacc[] = hundredthousandaccFile.getFile();

    start = System.currentTimeMillis();
    InsertionSort hundredthousandaccIO = new InsertionSort();
    hundredthousandaccIO.sort(arrayhundredthousandacc);
    hundredthousandaccIO.printInsertAcc(arrayhundredthousandacc);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Accending 100000 Insertion Sort took " + timeElapsed + " milliseconds.");

    start = System.currentTimeMillis();
    MergeSort hundredthousandaccMS = new MergeSort();
    hundredthousandaccMS.sort(arrayhundredthousandacc, 0, arrayhundredthousandacc.length - 1);
    hundredthousandaccMS.printMergeAcc(arrayhundredthousandacc);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Accending 100000 Merge Sort took " + timeElapsed + " milliseconds.");


    /** ACCENDING MILLION INTEGERS */
    ReadFile millionaccFile = new ReadFile();
    readFile(new File("1000000keysaccending.txt"));
    int arraymillionacc[] = millionaccFile.getFile();

    start = System.currentTimeMillis();
    InsertionSort millionaccIO = new InsertionSort();
    millionaccIO.sort(arraymillionacc);
    millionaccIO.printInsertAcc(arraymillionacc);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Accending 1000000 Insertion Sort took " + timeElapsed + " milliseconds.");

    start = System.currentTimeMillis();
    MergeSort millionaccMS = new MergeSort();
    millionaccMS.sort(arraymillionacc, 0, arraymillionacc.length - 1);
    millionaccMS.printMergeAcc(arraymillionacc);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Accending 1000000 Merge Sort took " + timeElapsed + " milliseconds.");



    /** DESCENDING TEN INTEGERS */
    ReadFile tendesFile = new ReadFile();
    readFile(new File("10keysdescending.txt"));
    int arraytendes[] = tendesFile.getFile();

    // code to sort the array using Insertion Sort Algorithm
    start = System.currentTimeMillis();
    InsertionSort tendesIO = new InsertionSort();
    tendesIO.sort(arraytendes);
    tendesIO.printInsertDes(arraytendes);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Descending 10 Insertion Sort took " + timeElapsed + " milliseconds.");


    // code to sort the array using Merge Sort algorithm
    start = System.currentTimeMillis();
    MergeSort tendesMS = new MergeSort();
    tendesMS.sort(arraytendes, 0, arraytendes.length - 1);
    tendesMS.printMergeDes(arraytendes);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Descending 10 Merge Sort took " + timeElapsed + " milliseconds.");

    /** DESCENDING ONE HUNDRED INTEGERS */
    ReadFile hundreddesFile = new ReadFile();
    readFile(new File("100keysdescending.txt"));
    int arrayhundreddes[] = hundreddesFile.getFile();

    // code to sort the array using Insertion Sort Algorithm
    start = System.currentTimeMillis();
    InsertionSort hundreddesIO = new InsertionSort();
    hundreddesIO.sort(arrayhundreddes);
    hundreddesIO.printInsertDes(arrayhundreddes);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Descending 100 Insertion Sort took " + timeElapsed + " milliseconds.");

    // code to sort the array using Merge Sort algorithm
    start = System.currentTimeMillis();
    MergeSort hundreddesMS = new MergeSort();
    hundreddesMS.sort(arrayhundreddes, 0, arrayhundreddes.length - 1);
    hundreddesMS.printMergeDes(arrayhundreddes);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Descending 100 Merge Sort took " + timeElapsed + " milliseconds.");


    /** DESCENDING THOUSAND INTEGERS */
    ReadFile thousanddesFile = new ReadFile();
    readFile(new File("1000keysdescending.txt"));
    int arraythousanddes[] = thousanddesFile.getFile();

    // code to sort the array using Insertion Sort Algorithm
    start = System.currentTimeMillis();
    InsertionSort thousanddesIO = new InsertionSort();
    thousanddesIO.sort(arraythousanddes);
    thousanddesIO.printInsertDes(arraythousanddes);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Descending 1000 Insertion Sort took " + timeElapsed + " milliseconds.");

    // code to sort the array using Merge Sort algorithm
    start = System.currentTimeMillis();
    MergeSort thousanddesMS = new MergeSort();
    thousanddesMS.sort(arraythousanddes, 0, arraythousanddes.length - 1);
    thousanddesMS.printMergeDes(arraythousanddes);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Descending 1000 Merge Sort took " + timeElapsed + " milliseconds.");


    /** DESCENDING TEN THOUSAND INTEGERS */
    ReadFile tenthousanddesFile = new ReadFile();
    readFile(new File("10000keysdescending.txt"));
    int arraytenthousanddes[] = tenthousanddesFile.getFile();

    // code to sort the array using Insertion Sort Algorithm
    start = System.currentTimeMillis();
    InsertionSort tenthousanddesIO = new InsertionSort();
    tenthousanddesIO.sort(arraytenthousanddes);
    tenthousanddesIO.printInsertDes(arraytenthousanddes);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Descending 10000 Insertion Sort took " + timeElapsed + " milliseconds.");

    // code to sort the array using Merge Sort algorithm
    start = System.currentTimeMillis();
    MergeSort tenthousanddesMS = new MergeSort();
    tenthousanddesMS.sort(arraytenthousanddes, 0, arraytenthousanddes.length - 1);
    tenthousanddesMS.printMergeDes(arraytenthousanddes);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Descending 10000 Merge Sort took " + timeElapsed + " milliseconds.");


    /** DESCENDING HUNDRED THOUSAND INTEGERS */
    ReadFile hundredthousanddesFile = new ReadFile();
    readFile(new File("100000keysdescending.txt"));
    int arrayhundredthousanddes[] = hundredthousanddesFile.getFile();

    start = System.currentTimeMillis();
    InsertionSort hundredthousanddesIO = new InsertionSort();
    hundredthousanddesIO.sort(arrayhundredthousanddes);
    hundredthousanddesIO.printInsertDes(arrayhundredthousanddes);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Descending 100000 Insertion Sort took " + timeElapsed + " milliseconds.");

    start = System.currentTimeMillis();
    MergeSort hundredthousanddesMS = new MergeSort();
    hundredthousanddesMS.sort(arrayhundredthousanddes, 0, arrayhundredthousanddes.length - 1);
    hundredthousanddesMS.printMergeDes(arrayhundredthousanddes);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Descending 100000 Merge Sort took " + timeElapsed + " milliseconds.");


    /** ACCENDING MILLION INTEGERS */
    ReadFile milliondesFile = new ReadFile();
    readFile(new File("1000000keysdescending.txt"));
    int arraymilliondes[] = milliondesFile.getFile();

    start = System.currentTimeMillis();
    InsertionSort milliondesIO = new InsertionSort();
    milliondesIO.sort(arraymilliondes);
    milliondesIO.printInsertDes(arraymilliondes);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Descending 1000000 Insertion Sort took " + timeElapsed + " milliseconds.");

    start = System.currentTimeMillis();
    MergeSort milliondesMS = new MergeSort();
    milliondesMS.sort(arraymilliondes, 0, arraymilliondes.length - 1);
    milliondesMS.printMergeDes(arraymilliondes);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;
    System.out.println("Descending 1000000 Merge Sort took " + timeElapsed + " milliseconds.");

  }
}
