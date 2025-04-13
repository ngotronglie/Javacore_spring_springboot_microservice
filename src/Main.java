public class Main {

    // 1. Kiểu dữ liệu cơ bản và toán tử
    public static void dataTypesAndOperators() {
        int a = 10;
        int b = 5;
        int sum = a + b;
        int product = a * b;
        int division = a / b;
        int remainder = a % b;

        System.out.println("Tổng: " + sum);
        System.out.println("Tích: " + product);
        System.out.println("Chia: " + division);
        System.out.println("Dư: " + remainder);

        a++;
        ++b;
        System.out.println("a sau a++: " + a);
        System.out.println("b sau ++b: " + b);
    }

    // 2. Câu lệnh điều kiện: if, if-else, if-else if
    public static void conditionExamples() {
        int score = 85;

        // if đơn giản
        if (score > 80) {
            System.out.println("Loại Giỏi");
        }

        // if - else
        if (score < 50) {
            System.out.println("Rớt môn");
        } else {
            System.out.println("Đậu môn");
        }

        // if - else if - else
        if (score >= 90) {
            System.out.println("Xếp loại A");
        } else if (score >= 70) {
            System.out.println("Xếp loại B");
        } else if (score >= 50) {
            System.out.println("Xếp loại C");
        } else {
            System.out.println("Xếp loại D");
        }
    }

    // 3. Switch Case nâng cao
    public static void switchExample(int day) {
        switch (day) {
            case 1 -> System.out.println("Thứ Hai");
            case 2 -> System.out.println("Thứ Ba");
            case 3 -> System.out.println("Thứ Tư");
            case 4 -> System.out.println("Thứ Năm");
            case 5 -> System.out.println("Thứ Sáu");
            case 6 -> System.out.println("Thứ Bảy");
            case 7 -> System.out.println("Chủ Nhật");
            default -> System.out.println("Ngày không hợp lệ");
        }
    }

    // 4. Vòng lặp for, while, do-while
    public static void loopExamples() {
        System.out.println("-- For loop --");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("-- While loop --");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("-- Do-While loop --");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);
    }

    // 5. Mảng 1 chiều + duyệt bằng for và foreach
    public static void arrayExample() {
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("Duyệt mảng bằng for thường:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Phần tử " + i + ": " + numbers[i]);
        }

        System.out.println("Duyệt mảng bằng foreach:");
        for (int num : numbers) {
            System.out.println("Giá trị: " + num);
        }
    }

    // 6. Phương thức có trả về, không trả về, có tham số
    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static void xinChao(String ten) {
        System.out.println("Xin chào, " + ten);
    }

    // 7. OOP - Lớp và đối tượng
    static class Student {
        String name;
        int age;

        void introduce() {
            System.out.println("Tên: " + name + ", Tuổi: " + age);
        }
    }

    // 8. Kế thừa
    static class Animal {
        void makeSound() {
            System.out.println("Động vật phát ra âm thanh");
        }
    }

    static class Cat extends Animal {
        void meow() {
            System.out.println("Meo meo!");
        }
    }

    // 9. Toán tử logic & so sánh
    public static void logicOperatorExample() {
        int a = 10;
        int b = 20;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b && b > 15: " + (a < b && b > 15));
        System.out.println("a > 5 || b < 10: " + (a > 5 || b < 10));
    }

    public static void main(String[] args) {
        System.out.println("== 1. Kiểu dữ liệu & toán tử ==");
        dataTypesAndOperators();

        System.out.println("\n== 2. Câu lệnh điều kiện ==");
        conditionExamples();

        System.out.println("\n== 3. Switch Case ==");
        switchExample(4);

        System.out.println("\n== 4. Vòng lặp ==");
        loopExamples();

        System.out.println("\n== 5. Mảng ==");
        arrayExample();

        System.out.println("\n== 6. Phương thức ==");
        int tong = tinhTong(10, 20);
        System.out.println("Tổng là: " + tong);
        xinChao("Liêm");

        System.out.println("\n== 7. Đối tượng ==");
        Student s = new Student();
        s.name = "Ngô Trọng Liêm";
        s.age = 20;
        s.introduce();

        System.out.println("\n== 8. Kế thừa ==");
        Cat cat = new Cat();
        cat.makeSound(); // từ lớp cha
        cat.meow();      // từ lớp con

        System.out.println("\n== 9. Toán tử logic ==");
        logicOperatorExample();
    }
}
