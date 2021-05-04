/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class OperasiMatriks {

    float A[][], B[][], C[][], D[][];
    int barisA, kolomA, barisB, kolomB, k, operasi;
    int lokA_B, lokA_K, lokB_B, lokB_K;
    Scanner input = new Scanner(System.in);
    String pilih;

    public void ukuranMatriks() {
        System.out.println("Ukuran Array 2D A");
        System.out.print("Masukkan ukuran baris: ");
        barisA = input.nextInt();
        System.out.print("Masukkan ukuran baris: ");
        kolomA = input.nextInt();
        A = new float[barisA][kolomA];
        C = new float[barisA][kolomA];

        System.out.println("Masukkan Nilai Matriks A");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "]:");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("");

        System.out.println("Ukuran Array 2D B");
        System.out.print("Masukkan ukuran baris: ");
        barisB = input.nextInt();
        System.out.print("Masukkan ukuran baris: ");
        kolomB = input.nextInt();
        B = new float[barisB][kolomB];
        D = new float[barisB][kolomB];

        System.out.println("Masukkan Nilai Matriks A");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "]:");
                B[i][j] = input.nextInt();
            }
        }
        System.out.println("");
    }

    public void cetakMatriks() {
        System.out.println("Array 2d A =");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print(+(int) (A[i][j]) + " ");
            }
            System.out.println(" ");
        }
        System.out.println("");

        System.out.println("Array 2d B =");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print(+(int) (B[i][j]) + " ");
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

    public void nilaiK() {
        System.out.print("Masukkan nilai k: ");
        k = input.nextInt();
    }

    public void pilihanOperasi() {
        System.out.println("Pilihan Operasi: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Nilai Maksimum");
        System.out.println("");
        String pilih;

        do {
            System.out.print("Masukkan angka pilihan operasi: ");
            operasi = input.nextInt();
            cekOperasi();
        } while (1 < operasi && operasi > 5);

    }

    public void cekOperasi() {
        switch (operasi) {
            case 1:
                penjumlahan();
                break;
            case 2:
                pengurangan();
                break;
            case 3:
                perkalian();
                break;
            case 4:
                pembagian();
                break;
            case 5:
                nilaiMaximal();
                break;
            default:
                System.out.println("Masukkan angka yang benar");
                break;
        }
    }

    public void penjumlahan() {
        /* Melakukan penjumlahan matriks*/
        nilaiK();
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                C[i][j] = k + A[i][j];
            }
        }
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                D[i][j] = k + B[i][j];
            }
        }
        System.out.println("\nHasil penjumlahan Matriks");
        System.out.println("===========================");
        System.out.println("Penjumlahan k dengan array2D A adalah");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print(+(int) (C[i][j]) + " ");
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("Penjumlahan k dengan array2D B adalah");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print(+(int) (D[i][j]) + " ");
            }
            System.out.println(" ");
        }
    }

    public void pengurangan() {
        /* Melakukan pengurangan matriks*/
        nilaiK();
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                C[i][j] = k - A[i][j];
            }
        }
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                D[i][j] = k - B[i][j];
            }
        }
        System.out.println("\nHasil penjumlahan Matriks");
        System.out.println("===========================");
        System.out.println("Pengurangan k dengan array2D A adalah");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print(+(int) (C[i][j]) + " ");
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("Penjumlahan k dengan array2D B adalah");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print(+(int) (D[i][j]) + " ");
            }
            System.out.println(" ");
        }
    }

    public void perkalian() {
        /* Melakukan perkalian matriks*/
        nilaiK();
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                C[i][j] = k * A[i][j];
            }
        }
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                D[i][j] = k * B[i][j];
            }
        }
        System.out.println("\nHasil penjumlahan Matriks");
        System.out.println("===========================");
        System.out.println("Penjumlahan k dengan array2D A adalah");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print(+(int) (C[i][j]) + " ");
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("Penjumlahan k dengan array2D B adalah");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print(+(int) (D[i][j]) + " ");
            }
            System.out.println(" ");
        }
    }

    public void pembagian() {
        /* Melakukan pembagian matriks*/
        nilaiK();
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                C[i][j] = k / A[i][j];
            }
        }
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                D[i][j] = k / B[i][j];
            }
        }
        System.out.println("\nHasil penjumlahan Matriks");
        System.out.println("===========================");
        System.out.println("Penjumlahan k dengan array2D A adalah");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print(+(C[i][j]) + " ");
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("Penjumlahan k dengan array2D B adalah");
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print(+(D[i][j]) + " ");
            }
            System.out.println(" ");
        }
    }

    public void nilaiMaximal() {
        int max1 = (int) A[0][0];
        int max2 = (int) B[0][0];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                if (max1 < A[i][j]) {
                    max1 = (int) A[i][j];
                    lokA_B = i + 1;
                    lokA_K = j + 1;
                }
            }
        }
        System.out.println("Nilai makasimum Array A adalah "
                + "" + max1 + " berada di baris ke-" + lokA_B + " "
                + "kolom ke-" + lokA_K);
//        for (int i = 0; i < barisA; i++) {
//            for (int j = 0; j < kolomA; j++) {
//                System.out.println("Nilai makasimum Array A adalah "
//                        + "" + max1 + " berada di baris ke-" + lokA_B + " "
//                        + "kolom ke-" + lokA_K);
//            }
//        }

        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                if (max2 < B[i][j]) {
                    max2 = (int) B[i][j];
                    lokB_B = i + 1;
                    lokB_K = j + 1;
                }
            }
        }
        System.out.println("Nilai makasimum Array B adalah "
                + "" + max2 + " berada di baris ke-" + lokB_B + " "
                + "kolom ke-" + lokB_K);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String pilih = "";
        OperasiMatriks akhir = new OperasiMatriks();
        akhir.ukuranMatriks();
        akhir.cetakMatriks();
        do {
            akhir.pilihanOperasi();
            System.out.print("Pilih operasi lagi? (y/t): ");
            pilih = input.nextLine();
        } while ("y".equals(pilih));
    }
}
