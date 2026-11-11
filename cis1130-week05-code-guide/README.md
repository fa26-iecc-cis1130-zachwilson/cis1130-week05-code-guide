# CIS 1130 Week 5 Code Guide: Arrays

Runnable, fully commented Java examples for **Week 5** of CIS 1130 Intro to Computer Science (IECC Online). Every file goes with a Week 5 Learning Guide in Canvas. Read the comments, run the program, then change something and run it again.

## How to use this repository

1. Open the course JupyterHub and start a **Terminal**.
2. Copy this repository into your workspace (you only need to do this once):

   ```
   git clone https://github.com/fa26-iecc-cis1130-zachwilson/cis1130-week05-code-guide.git
   cd cis1130-week05-code-guide
   ```

3. Move into a folder, then compile and run any example:

   ```
   cd chapter07-single-dimensional-arrays
   javac ArrayBasics.java
   java ArrayBasics
   ```

You can also just read the files here on GitHub. Select a file name to view it.

## What's inside

### Chapter 7: Single-Dimensional Arrays

| File | What it shows | Try this |
|------|---------------|----------|
| `ArrayBasics.java` | Creating arrays, indexes, `length`, default values, regular and enhanced for loops, why `b = a` doesn't copy | Uncomment the `days[5]` line and read the crash message. |
| `ArrayProcessing.java` | Total, average, largest, index of largest, counting, passing and returning arrays | Add a method that returns the index of the smallest value. |
| `SearchExamples.java` | Linear search and binary search, with a trace of each binary search check | Search for each value in the sorted array. What's the most checks it ever takes? |
| `SelectionSortExample.java` | Selection sort with a pass-by-pass trace | Change it to sort from largest to smallest. |
| `ParallelArrays.java` | Keeping two arrays lined up during a search and a sort | Add a third parallel array (like population) and keep it lined up too. |

### Chapter 8: Multidimensional Arrays

| File | What it shows | Try this |
|------|---------------|----------|
| `TwoDArrayBasics.java` | Creating 2D arrays, `grid[row][col]`, rows and columns, printing a table | Add a fourth week of study hours. |
| `TwoDArrayProcessing.java` | Row totals, column totals, grand total, finding the largest cell, passing a row to a 1D method | Add a column-average method and print each month's average. |

## A note on your own work

These examples teach the concepts. They are **not** homework or project solutions, and your graded work must be written by you. See the Course Policies page in Canvas for the full academic integrity and AI rules.

Questions? Email Professor Wilson at wilsonz@iecc.edu.
