import java.util.Scanner;

public class DeleteArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        //Nhap size mang
        do {
            System.out.println("Enter the size of the array");
            size = sc.nextInt();
            if (size <= 0) {
                System.out.println("Size must be at least 1");
            }
        } while (size <= 0);
        //Nhap gia tri phan tu\
        arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Enter the element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
            i++;
        }
        //Hien thi danh sach
        System.out.println("List: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        //Tien hanh xoa phan tu
        System.out.print("Nhap phan tu can xoa: ");
        int del = sc.nextInt();
        //Tim xem phan tu do co xuat hien trong mang khong
        int index_del = -1; //Khoi tao phan tu can xoa la -1, tuc la ko ton tai
        for (int k = 0; k < size; k++) {
            if (arr[k] == del) {
                index_del = k;
                break;
            }
        }
        //Kiem tra neu phan tu can xoa ko co trong mang
        if(index_del == -1) {
            System.out.println("Khong tim thay "+del+" trong mang!");
        }else {
            //Thuc hien xoa phan tu
            for(int k = 0; k < size - 1; k++) {
                arr[k] = arr[k+1]; //Dich chuyen cac phan tu phia sau
            }
            //Giam kich thuoc mang
            size--;
            //Ket thuc duyet mang va in ra mang
            System.out.println("Mang sau khi xoa phan tu: "+del+": ");
            for (int k = 0; k < size; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
