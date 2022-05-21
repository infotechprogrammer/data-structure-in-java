package com.Pattern_Problems;

public class _01_pattern {
    public static void main(String[] args) {
        System.out.println("1.");
        pattern1(4);
        System.out.println("\n2.");
        pattern2(4);
        System.out.println("\n3.");
        pattern3(5);
        System.out.println("\n4.");
        pattern4(5);
        System.out.println("\n5.");
        pattern5(5);
        System.out.println("\n6.");
        pattern6(5);
        System.out.println("\n7.");
        pattern7(5);
        System.out.println("\n8.");
        pattern8(3);
        System.out.println("\n9.");
        pattern9(4);
        System.out.println("\n10.");
        pattern10(4);
        System.out.println("\n11.");
        pattern11(4);
        System.out.println("\n12.");
        pattern12(4);
        System.out.println("\n12.1.");
        newpattern12(4);
        System.out.println("\n13.");
        pattern13(3);
        System.out.println("\n14.");
        pattern14(3);
        System.out.println("\n15.");
        pattern15(3);
        System.out.println("\n16.");
        pattern16(3);
        System.out.println("\n17.");
        pattern17(3);
        System.out.println("\n18.");
        pattern18(4);
        System.out.println("\n19.");
        pattern19(4);
        System.out.println("\n20.");
        pattern20(4);
        System.out.println("\n21.");
        pattern21(4);
        System.out.println("\n22.");
        pattern22(4);
        System.out.println("\n23.");
        pattern23(4);
        System.out.println("\n24.");
        pattern24(4);
        System.out.println("\n25.");
        pattern25(4);
        System.out.println("\n26.");
        pattern26(4);
        System.out.println("\n27.");
        pattern27(5);
        System.out.println("\n28.");
        pattern28(5);
        System.out.println("\n29.");
        pattern29(5);
        System.out.println("\n30.");
        pattern30(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2*n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(n-col+1);
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        int count = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        int count = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        int count = 1;
        for (int row = 1; row <= n; row++) {
            int value = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 1; row <= n; row++) {
            int value = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(value);
                value--;
            }
            System.out.println();
        }
    }

    static void newpattern12(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row-col+1 + " ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print((char)(65 + row - 1));
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print((char)(65 + col - 1));
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        char ch = 'A';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    static void pattern16(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print((char)(65 + row + col - 2));
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print((char)(65 + row - 1));
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {
        int count = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print((char)(65 + count- 1));
                count++;
            }
            System.out.println();
        }
    }

    static void pattern19(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print((char)(65 + row + col - 2));
            }
            System.out.println();
        }
    }

    static void pattern20(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print((char)(65 + n - col));
            }
            System.out.println();
        }
    }

    static void pattern21(int n) {
        for (int row = 1; row <= n; row++) {
            char start = (char)(65 + n - row);
            for (int col = 1; col <= row; col++) {
                System.out.print(start);
                start++;
            }
            System.out.println();
        }
    }

    static void pattern22(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern23(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < row-1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n- row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern24(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < row - 1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n- row + 1; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    static void pattern25(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    static void pattern26(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for (int start = row-1; start >= 1; start--) {
                System.out.print(start);
            }
            System.out.println();
        }
    }

    static void pattern27(int n) {
        for (int row = 1; row <= 2*n; row++) {
            int c = row > n ? 2*n - row : row;
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2*n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern29(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
