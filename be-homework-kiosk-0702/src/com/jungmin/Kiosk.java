package com.jungmin;

import java.util.Scanner;


public class Kiosk {

    private final MenuItem menuItem1 = new MenuItem("김밥", 1000);
    private final static MenuItem menuItem2 = new MenuItem("계란 김밥", 1500);
    private final static MenuItem menuItem3 = new MenuItem("충무 김밥", 1000);
    private final static MenuItem menuItem4 = new MenuItem("떡볶이", 2000);

    private MenuItem youChoiceMenuItem;
    private int menuCount;

    // 주문 안내 메시지를 출력하는 메서드를 정의할 수 있습니다.
    public void message(){
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("------------------------------");
    }
    // 주문할 음식을 선택하는 메서드를 정의 할 수 있습니다.

    public void menuItem(){
        boolean a;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
            System.out.println("1) " + menuItem1.getName() + "(" + menuItem1.getPrice()+")" +
                    "  2) " + menuItem2.getName() + "(" + menuItem2.getPrice()+")" +
                    "  3) " + menuItem3.getName() + "(" + menuItem3.getPrice()+")" +
                    "  4) " + menuItem4.getName() + "(" + menuItem4.getPrice()+")");
            int num = Integer.parseInt(sc.nextLine());
            switch(num){
                case 1:
                    youChoiceMenuItem = menuItem1;
                    return;
                case 2:
                    youChoiceMenuItem = menuItem2;
                    return;
                case 3:
                    youChoiceMenuItem = menuItem3;
                    return;
                case 4:
                    youChoiceMenuItem = menuItem4;
                    return;
                default:
                    System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");
                    a = false;
            }
        }while (!a);
    }
    // 주문할 음식의 수량을 입력하는 메서드를 정의할 수 있습니다.
    public void count(){
        Scanner sc1 = new Scanner(System.in);
        int i ;
        while (true){
            System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
            System.out.println("(※ 최대 주문 가능 수량 : 99)");
            i = Integer.parseInt(sc1.nextLine());
            menuCount = i;
            if(i>=1 && i <= 99){
                break;
            }else {
                System.out.println("[경고]" +i +"개는 입력하실 수 없습니다.");
                System.out.println("[경고]수량 선택 화면으로 돌아갑니다.");
                System.out.println("------------------------------");
            }
        }
    }
    // 음식 주문을 위한 메서드를 정의할 수 있습니다.
    // 주문 결과를 출력하는 메서드를 정의할 수 있습니다.
    public void result(){
        int sum =youChoiceMenuItem.getPrice() * menuCount;
        System.out.println("[안내]주문하신 메뉴의 총 금액은" + sum +"원 입니다.");
        System.out.println("[안내]이용해 주셔서 감사합니다.");
    }
}
