package array.single;

import java.util.Random;

public class Func18 {
    public static void main(String[] arg) {
        int array[] = new int[10];
        boolean isOpen = false;
        boolean allNormal = true;
        int index = 0;
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            int lastindex = random.nextInt(10);
            while (lastindex == index) {
                lastindex = random.nextInt(10);
            }
            index = lastindex;
            array[index] = random.nextInt(6) + 1;
        }

        while (!isOpen) {
            allNormal = true;
            for (int i = 0; i < 9; i++) {
                if (i < 8 && array[i] != 0 && array[i + 2] != 0 && array[i + 1] == 0) {
                    array[i + 1] = 10 - array[i] - array[i + 2];
                }
            }

            for (int i = 1; i < 9; i++) {
                if (array[i] != 0) {
                    if (array[i] % 2 != 0) {
                        if (array[i - 1] == 0 && array[i + 1] == 0) {
                            array[i - 1] = (10 - array[i]) / 2;
                            array[i + 1] = (10 - array[i]) / 2 + 1;
                        } else {
                            if (array[i - 1] == 0) {
                                array[i - 1] = (10 - array[i] - array[i + 1]);
                            }
                            if (array[i + 1] == 0) {
                                array[i + 1] = (10 - array[i] - array[i - 1]);
                            }
                        }
                    } else {
                        if (array[i + 1] == 0 && array[i - 1] == 0) {
                            array[i - 1] = (10 - array[i]) / 2 - 1;
                            array[i + 1] = (10 - array[i]) / 2 + 1;
                        } else {
                            if (array[i - 1] == 0) {
                                array[i - 1] = (10 - array[i] - array[i + 1]);
                            }
                            if (array[i + 1] == 0) {
                                array[i + 1] = (10 - array[i] - array[i - 1]);
                            }
                        }
                    }
                }
                if (array[i - 1] != 0) {
                    if (array[i - 1] % 2 != 0) {
                        if (array[i] == 0) {
                            array[i] = (10 - array[i - 1]) / 2 - 1;
                        }
                        if (array[i + 1] == 0) {
                            array[i + 1] = (10 - array[i - 1]) / 2 + 1;
                        }
                    } else {
                        if (array[i + 1] == 0) {
                            array[i] = (10 - array[i - 1]) / 2;
                        }
                        if (array[i + 1] == 0) {
                            array[i + 1] = (10 - array[i - 1]) / 2;
                        }
                    }
                }
            }

            for (int i = 1; i < 10; i++) {
                if (array[i - 1] == 0) {
                    allNormal = false;
                }
                if (allNormal && i == 9) {
                    isOpen = true;
                }
            }

        }

        for (int i = 1; i < 9; i++) {
            if (array[i - 1] + array[i] + array[i + 1] != 10) {
                allNormal = false;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (array[i] < 0 && array[i] > 6) {
                allNormal = false;
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(array[i]);
        }

        if (allNormal) {
            System.out.println("Открыли");
        } else {
            System.out.println("Не получилось возможно не возможная комбинация");
        }
    }
}
