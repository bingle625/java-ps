import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String packageName = "problems";
        File packageDir = new File("src/" + packageName.replace('.', '/'));

        // 패키지 내의 모든 클래스 파일을 검색하고 최신순으로 정렬
        List<File> classFiles = Arrays.stream(packageDir.listFiles())
                .filter(file -> file.getName().endsWith(".java"))
                .sorted(Comparator.comparingLong(File::lastModified).reversed())
                .collect(Collectors.toList());

        String[] arr = packageName.split(" ");
        int length = arr.length;
        // 상위 5개의 클래스 이름 추출
        List<String> top5ClassNames = classFiles.stream()
                .limit(5)
                .map(file -> file.getName().replace(".java", ""))
                .collect(Collectors.toList());

        // 사용자에게 상위 5개의 클래스 이름을 보여주기
        System.out.println("풀이할 문제를 골라주세요:");
        for (int i = 0; i < top5ClassNames.size(); i++) {
            System.out.println((i + 1) + ". " + top5ClassNames.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("번호 혹은 문제의 이름을 작성해주세요. (번호는 상위 5개까지만 노출):");
        String userInput = scanner.nextLine();

        String selectedClassName;
        if (userInput.matches("\\d+")) {
            int index = Integer.parseInt(userInput) - 1;
            if (index < 0 || index >= top5ClassNames.size()) {
                System.out.println("잘못된 선택입니다.");
                return;
            }
            selectedClassName = top5ClassNames.get(index);
        } else {
            selectedClassName = userInput;
            if (!top5ClassNames.contains(selectedClassName)) {
                System.out.println("잘못된 선택입니다.");
                return;
            }
        }

        try {
            // 문제 번호에 해당하는 클래스 이름을 생성
            String className = packageName + "." + selectedClassName;
            // 해당 클래스의 Class 객체를 얻음
            Class<?> problemClass = Class.forName(className);
            // 해당 클래스의 인스턴스를 생성
            Object problemInstance = problemClass.getDeclaredConstructor().newInstance();
            // solve 메서드를 호출
            problemClass.getMethod("solve").invoke(problemInstance);
        } catch (ClassNotFoundException e) {
            System.out.println("찾을 수 없는 Problem 클래스입니다.: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("오류가 발생했습니다.: " + e.getMessage());
        }

        scanner.close();
    }
}