import java.util.Scanner;

class App{
    public static void main(String[] args) {

        //List<Integer> date = new ArrayList<>();
        int dates[] = new int[3];
        
        Scanner scan = new Scanner(System.in);

        System.out.println("write a year, a month, and a number of days.");

        for(int i = 0; i < 3; i++){
            int getDate = Integer.parseInt(scan.nextLine());
            dates[i] = getDate;
            //date.add(getDate);
        }

        int year = dates[0] * 365;
        int month = dates[1] * 30;
        int totalDays = year + month + dates[2];

        System.out.println("Total days of your life: " + totalDays);
        
        scan.close();
    }
}