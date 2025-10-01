#!/bin/bash

# ===== 플랫폼 선택 =====
echo "Select platform:"
echo "  1) LeetCode"
echo "  2) Baekjoon (BOJ)"
echo "  3) Programmers"
read -p "Enter choice [1-3] or name (leetcode/boj/programmers): " PLATFORM_INPUT

# 소문자 정규화
PLATFORM_NORM=$(echo "$PLATFORM_INPUT" | tr '[:upper:]' '[:lower:]')

# 플랫폼별 접두어·패키지 서브경로 매핑
case "$PLATFORM_NORM" in
  1|leetcode|lc)
    PREFIX="LC_"
    SUBPKG="leetcode"
    ;;
  2|baekjoon|boj|baek|backjoon)
    PREFIX="BOJ_"
    SUBPKG="boj"
    ;;
  3|programmers|pg|프로그래머스)
    PREFIX="PG_"
    SUBPKG="programmers"
    ;;
  *)
    echo "Invalid platform selection."
    exit 1
    ;;
esac

# ===== 클래스 이름 입력 =====
read -p "Enter the class name (e.g., TwoSum or 1000 A plus B): " CLASS_NAME

# 공백 제거 + 스페이스를 언더바로 치환
CLASS_NAME="$(echo -e "$CLASS_NAME" | sed -e 's/^[[:space:]]*//' -e 's/[[:space:]]*$//' -e 's/[[:space:]]\+/_/g')"

# 클래스 이름 검증
if [ -z "$CLASS_NAME" ]; then
  echo "Class name cannot be empty."
  exit 1
fi

# Java 식별자에 무리될 수 있는 특수문자 제거 (언더바로 치환)
SANITIZED_CLASS_NAME=$(echo "$CLASS_NAME" | sed 's/[^A-Za-z0-9_]/_/g')

# 최종 클래스명
FULL_CLASS_NAME="${PREFIX}${SANITIZED_CLASS_NAME}"

# 패키지/경로 설정
BASE_DIR="src/problems"
PACKAGE_DIR="${BASE_DIR}/${SUBPKG}"
CLASS_FILE="${PACKAGE_DIR}/${FULL_CLASS_NAME}.java"
PACKAGE_DECLARATION="package problems.${SUBPKG};"

# 디렉토리 생성
mkdir -p "$PACKAGE_DIR"

# 파일 존재 시 덮어쓰기 확인
if [ -f "$CLASS_FILE" ]; then
  read -p "File exists. Overwrite? [y/N]: " CONFIRM
  case "$(echo "$CONFIRM" | tr '[:upper:]' '[:lower:]')" in
    y|yes) ;;
    *) echo "Aborted."; exit 1 ;;
  esac
fi

# 클래스 파일 생성
cat <<EOF > "$CLASS_FILE"
${PACKAGE_DECLARATION}

import java.io.*;

public class ${FULL_CLASS_NAME} {
    public void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine(); // 입력 한 줄 받기
        System.out.println(line);        // 디버깅 출력 (문제에 맞게 수정)
        // 문제 해결 코드 작성
    }

    public static void main(String[] args) throws IOException {
        new ${FULL_CLASS_NAME}().solve();
    }
}
EOF

echo "Class ${FULL_CLASS_NAME} created at ${CLASS_FILE}"
echo "Package: problems.${SUBPKG}"