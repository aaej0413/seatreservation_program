import java.util.Scanner;

public class SeatType extends Seat {

    String name;
    int seatType;
    int seatNumber;

    void book(String[][] s, String[][] a, String[][] b) {

        System.out.println("좌석 선택: S석(1), A석(2), B석(3)");

        Scanner sc = new Scanner(System.in);

        seatType = sc.nextInt();

        if (seatType != 1 && seatType != 2 && seatType != 3) {
            System.out.println("잘못된 입력입니다.");
            book(s, a, b);
        }

        switch (seatType) {
            case 1:
                while (true) {
                    System.out.print("S: ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(s[i][0]);
                    }
                    System.out.println();
                    name = getName() + " ";
                    seatNumber = getSeatNumber() - 1;

                    if (seatNumber >= 0 && seatNumber < 10) { // 좌석번호가 유효한지 확인
                        if (seatChk(seatType, seatNumber, name) == 0) {
                            break;
                        }
                    } else {
                        System.out.println("자리번호 오류입니다. 다시 입력해주세요.");
                    }
                }
                    break;
            case 2:
                while (true) {
                    System.out.print("A: ");
                    for (int i = 0; i < 15; i++) {
                        System.out.print(a[i][0]);
                    }
                    System.out.println();
                    name = getName() + " ";
                    seatNumber = getSeatNumber() - 1;

                    if (seatNumber >= 0 && seatNumber < 15) {
                        if (seatChk(seatType, seatNumber, name) == 0) {
                            break;
                        }
                    } else {
                        System.out.println("자리번호 오류입니다. 다시 입력해주세요.");
                    }
                }
                break;
            case 3:
                while (true) {
                    System.out.print("B: ");
                    for (int i = 0; i < 20; i++) {
                        System.out.print(b[i][0]);
                    }
                    System.out.println();
                    name = getName() + " ";
                    seatNumber = getSeatNumber() - 1;

                    if (seatNumber >= 0 && seatNumber < 20) {
                        if (seatChk(seatType, seatNumber, name) == 0) {
                            break;
                        }
                    } else {
                            System.out.println("자리번호 오류입니다. 다시 입력해주세요.");
                        }
                    }
                break;
        }
    }
    void check(String[][] s, String[][] a, String[][] b) {
        System.out.print("S: ");
        for(int i = 0; i < 10; i++) {
            System.out.print(s[i][0]);
        }
        System.out.println();

        System.out.print("A: ");
        for(int i = 0; i < 15; i++) {
            System.out.print(a[i][0]);
        }
        System.out.println();

        System.out.print("B: ");
        for(int i = 0; i < 20; i++) {
            System.out.print(b[i][0]);
        }
        System.out.println();

        System.out.println("조회를 완료하였습니다.");
    }

    void cancle(String[][] s, String [][] a, String[][] b) {
        System.out.println("좌석 선택: S석(1), A석(2), B석(3)");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num != 1 && num !=2 && num != 3) {
            System.out.println("잘못된 입력입니다.");
            cancle(s,a,b);
        }

        switch (num) {

            case 1:
                System.out.print("S: ");
                for(int i = 0; i < 10; i++) {
                    System.out.print(s[i][0]);
                }
                System.out.println();
                break;
            case 2:
                System.out.print("A: ");
                for(int i = 0; i < 15; i++) {
                    System.out.print(a[i][0]);
                }
                System.out.println();
                break;
            case 3:
                System.out.print("B: ");
                for(int i = 0; i < 20; i++) {
                    System.out.print(b[i][0]);
                }
                System.out.println();
                break;
        }
        String name = getName() + " ";

        if (cancelChk(num,name) == 1) {
            cancle(s,a,b);
        }
    }
    void end() {
        System.out.println("프로그램이 종료됩니다.");
        System.exit(0);
    }
}
