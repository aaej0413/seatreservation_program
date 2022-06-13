import java.util.Scanner;

public class Seat {

    // 자리 갯수랑 모양 만들기.
    String[][] s = new String[10][2];
    String[][] a = new String[15][2];
    String[][] b = new String[20][2];

    // 좌석 기본 모양 정해주기.
    Seat() {
        for(int i = 0; i < 10; i++) {
            s[i][0] = (i+1)+"--- ";
            s[i][1] = "0";
        }
        for(int i = 0; i < 15; i++) {
            a[i][0] = (i+1)+"--- ";
            a[i][1] = "0";
        }
        for(int i = 0; i < 20; i++) {
            b[i][0] = (i+1)+"--- ";
            b[i][1] = "0";
        }
    }
    // 예약자 성명 받는 메서드.
    String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("예약자 성명: ");
        String name = sc.next();
        return name;
    }

    // 좌석 번호를 받는 메서드.
    int getSeatNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호: ");
        int seatNumber = sc.nextInt();
        return seatNumber;
    }


    // 사람이 만약에 자리에 앉으면 0값이 1로 변함.
    void seatPerson (int seatType, int seatNumber, String name) {
        switch (seatType) {
            case 1:
                s[seatNumber][0] = name;
                s[seatNumber][1] = "1";
                break;
            case 2:
                a[seatNumber][0] = name;
                a[seatNumber][1] = "1";
                break;
            case 3:
                b[seatNumber][0] = name;
                b[seatNumber][1] = "1";
                break;
        }
    }

    // 예약할 때 좌석이 빈 자리인지 체크해주는 메서드.
    int seatChk(int seatType, int seatNumber, String name) {
        int ret = 0;

        switch (seatType) {
            case 1:
                if(s[seatNumber][1] == "1") {
                    System.out.println("이미 예약된 좌석입니다. 다시 예약해주세요.");
                    ret= 1;
                }

                else {
                    seatPerson(seatType,seatNumber,name);
                    System.out.println("예약 성공!");
                    ret = 0;
                }
                break;
            case 2:
                if(a[seatNumber][1] == "1") {
                    System.out.println("이미 예약된 좌석입니다. 다시 예약해주세요.");
                    ret = 1;
            }
                else {
                    seatPerson(seatType,seatNumber,name);
                    System.out.println("예약성공!");
                    ret = 0;
                }
                break;
            case 3:
                if(b[seatNumber][1] == "1") {
                    System.out.println("이미 예약된 좌석입니다. 다시 예약해주세요.");
                    ret = 1;
                }
                else {
                    seatPerson(seatType,seatNumber,name);
                    System.out.println("예약 성공!");
                    ret = 0;
                }
                break;
        }
        return ret;
    }

    int cancelChk(int seatNumber, String name) {

        switch (seatNumber) {

            case 1:
                while (true) {
                    for(int i = 0; i < 10; i++) {
                        if(name.equals(s[i][0])) {
                            s[i][0] = (i+1)+"--- ";
                            s[i][1] = "0";
                            break;
                        }
                    }
                    if(false) {
                        System.out.println("예약목록이 없습니다. 다시 입력해주세요.");
                        return 1;
                    }
                    else {
                        System.out.println("예약이 취소되었습니다.");
                        break;
                    }
                }
                break;
            case 2:
                while (true) {
                    for(int i = 0; i < 15; i++) {
                        if(name.equals(a[i][0])) {
                            a[i][0] = (i+1)+"--- ";
                            a[i][1] = "0";
                            break;
                        }
                    }
                    if(false) {
                        System.out.println("예약목록이 없습니다. 다시 입력해주세요.");
                        return 1;
                    }
                    else {
                        System.out.println("예약이 취소되었습니다.");
                        break;
                    }
                }
                break;
            case 3:
                while (true) {
                    for(int i = 0; i < 20; i++) {
                        if(name.equals(b[i][0])) {
                            b[i][0] = (i+1)+"--- ";
                            b[i][1] = "0";
                            break;
                        }
                    }
                    if(false) {
                        System.out.println("예약목록이 없습니다. 다시 입력해주세요.");
                        return 1;
                    }
                    else {
                        System.out.println("예약이 취소되었습니다.");
                        break;
                    }
                }
                break;
        }
        return 0;
    }

}