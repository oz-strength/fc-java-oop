package com.fc.javaoop;

import com.fc.javaoop.logic.BubbleSort;
import com.fc.javaoop.logic.JavaSort;
import com.fc.javaoop.logic.Sort;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
            System.out.println("[result]" + sort.sort(Arrays.asList(args)));
        }
    }
