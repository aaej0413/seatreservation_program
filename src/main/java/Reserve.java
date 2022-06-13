import java.util.Scanner;

public class Reserve extends SeatType {

    int run() {
        int num;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("예약하기(1), 예약 조회(2), 예약 취소(3), 종료(4): ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    book(s,a,b);
                    break;
                case 2:
                    check(s,a,b);
                    break;
                case 3:
                    cancle(s,a,b);
                    break;
                case 4:
                    end();
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
    
}
