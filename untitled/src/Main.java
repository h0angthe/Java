import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ten, quequan;
        int tuoi;
        Scanner sc = new Scanner(System.in);
        ArrayList<ThanhVien> DsThanhVien = new ArrayList<>();
        while(true){
            System.out.println("nhập điều kiện: ");
            String DK = sc.nextLine();
            if(DK.toLowerCase().equals("add_new")){
                System.out.println("Nhập tên: ");
                ten = sc.nextLine();
                while (true){
                    try{
                        System.out.println("Nhập tuổi");
                        tuoi = sc.nextInt();
                        break;
                    }catch (Exception e){
                        System.out.println("Nhập lại bằng số !");
                        sc.nextLine();
                    }
                }
                sc.nextLine();
                System.out.println("Nhập quê quán: ");
                quequan = sc.nextLine();
                ThanhVien tv = new ThanhVien();
                tv.setTen(ten);
                tv.setTuoi(tuoi);
                tv.setQuequan(quequan);
                DsThanhVien.add(tv);
            }else if (DK.toLowerCase().equals("report")){
                System.out.println("Danh sách thành viên là: ");
                System.out.println("Tên"+"\t"+"Tuổi"+"\t"+"Quê quán");
                for(int i=0; i < DsThanhVien.size();i++){
                    System.out.println(DsThanhVien.get(i).thongTin());
                }
            } else if (DK.toLowerCase().equals("exit")) {
                return;
            }
        }
    }
}